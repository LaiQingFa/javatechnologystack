import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

import java.io.IOException;

/**
 * jna  测试  http://www.cnblogs.com/lanxuezaipiao/p/3635556.html
 *
 * JNA使用一个小型的JNI库插桩程序来动态调用本地代码
 *
 * JNA(Java Native Access)是一个开源的Java框架，是Sun公司推出的一种调用本地方法的技术，
 * 是建立在经典的JNI基础之上的一个框架。之所以说它是JNI的替 代者，是因为JNA大大简化了调用
 * 本地方法的过程，使用很方便，基本上不需要脱离Java环境就可以完成。
 *
 * 类型映射（Type Mappings）
 * 跨平台、语言调用的难点，就是不同语言之间数据类型不一致造成的问题
 *
 * JNA只能实现Java访问C函数，作为一个Java框架，自然不能实现C语言调用Java代码。此时，你还是需要使用JNI技术
 */
public class JNAHelloWorld {
    public interface CLibrary extends Library {
        CLibrary INSTANCE = (CLibrary)
                Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"),
                        CLibrary.class);

        void printf(String format, Object... args);
    }
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        CLibrary.INSTANCE.printf("Hello, World\n");
        for (int i=0;i < args.length;i++) {
            CLibrary.INSTANCE.printf("Argument %d: %s\n", i, args[i]);
        }
    }

}
