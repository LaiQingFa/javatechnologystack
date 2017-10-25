package basic_;

/**
 * java 异常  泛型  反射
 */
public class Y_F_F {
/*
http://blog.csdn.net/bubble1210/article/details/50775815
（1）异常
    异常的概念：所谓异常是指程序在运行过程中发生的一些不正常事件。（如：除0溢出，数组下标越界，所读取的文件不存在）
    异常导致的结果：java程序的执行过程中如出现异常事件，可以生成一个异常类对象。该异常对象封装了异常事件的信息，并将其提交给java运行时系统，这个过程成为抛出异常，不处理的话会直接导致程序直接中断。
    java的异常是通过两种机制来处理的
    捕获：try-catch-finally try：监控区域，执行可能产生异常的代码 catch：捕获、处理异常 finally：处理善后，无论是否发生异常，代码总能执行
    抛出：throw，throws
            throw：手动抛出异常  throws：声明方法可能要抛出的异常
    try-catch-finally try
    try{}语句块中放的是要检测的java代码，可能有会抛出异常，也可能会正常执行
    catch（异常类型）{}块是当java运行时系统接收到try块中所抛出异常对象时，会寻找处理这一异常catch块来进行处理（可以有多个catch块）
    finally{}不管系统有没有抛出异常都会去执行，一般用来释放资源。除了在之前执行了System.exit（0）
    throw和throws
    throw用于手动抛出异常。作为程序员可以在任意位置手动抛出异常；
    throws用于在方法上标识要暴露的异常。抛出的异常交由调用者处理
    两者区别：throw用在方法内，后面跟上要抛出的异常类对象；throws修饰在方法上，告诉调用者此方法可能会抛出异常，后面跟上可能要抛出的异常类名。
    自定义异常
    常见异常：RuntimeException,IOException,SQLException,ClassNotFoundException
    自定义异常：java提供的异常体系不可能遇见所以希望加以报告的错误

（2）泛型
    泛型是JDK1.5引入的新特性，也是最重要的一个特性；泛型可以在编译时检查类型安全，并且所有的强制转换都是自动和隐私的；泛型的原理就是“类型的参数化”，即把类型看做参数。也就是说把所有操作的数据类型看做参数，就像方法的形式参数是运行时传递的值的占位符一样；简单的说，类型变量扮演的角色就如同一个参数，它提供给编译器用来类型检查的信息；泛型可以提高代码的扩展性和重用性。
    总结：所谓泛型，即通过参数化类型来实现在同一份代码上操作多种数据类型，泛型编程是一种编程范式，它利用“参数化类型”将类型抽象化，从而实现更为灵活的复用。

   1.当我们将一个对象放入集合中，集合不会记住此对象的类型，当再次从集合中取出此对象时，改对象的编译类型变成了Object类型，但其运行时类型任然为其本身类型
    可以使集合能够记住集合内元素各类型，且能够达到只要编译时不出现问题，运行时就不会出现“java.lang.ClassCastException”异常呢？答案就是使用泛型。

    泛型，即“参数化类型”。一提到参数，最熟悉的就是定义方法时有形参，然后调用此方法时传递实参。那么参数化类型怎么理解呢？顾名思义，就是将类型由原来的具体的类型参数化，类似于方法中的变量参数，此时类型也定义成参数形式（可以称之为类型形参），然后在使用/调用时传入具体的类型（类型实参）。

    泛型类
    泛型的类型参数可以是泛型类
    泛型类可以同时设置多个类型参数
    泛型类可以继承泛型类
    泛型类可以实现泛型接口
    限制泛型可用类型
    在定义泛型类别时，默认在实例化泛型类的时候可以使用任何类型，但是如果想要限制使用泛型类型时，只能用某个特定类型或者是其子类才能实例化该类型时，可以在定义类型时，使用extends关键字指定这个类型必须是继承某个类，或者实现某个接口
    当没有指定泛型继承的类型或接口时，默认使用extends Object，所以默认情况下任何类型都可以作为参数传入
    类型通配符声明
    同一泛型类，如果实例化时给定的实际类型不同，则这些实例的类型是不兼容的，不能相互赋值
    泛型类实例之间的不兼容性会带来使用的不便。我们可以使用泛型通配符（？）声明泛型类的变量就可以解决这个问题
    泛型通配的方式：“？”表示任意一个类型
    和限制泛型的上限相似，同样可以使用extends关键字限定通配符匹配类型的上限，还可以使用super关键字将通配符匹配类型限定为某个类型及其父类型
（3）反射
    概念：主要指程序可以访问、检测和修改它本身状态或行为的一种能力
    java反射机制是在运行状态中，对于任意一个类，都能够知道这个类所以属性和方法；对于任意一个对象，都能调用它的任意一个方法；这种动态获取信息以及动态调用对象的方法的功能称为java语言的反射机制。
    简单的来说，反射机制指的是程序在运行时能够获取自身的信息。在java中，只要给定类的姓名，那么就可以通过反射机制来获得类的所有信息。包括其访问修饰符、父类。实现的接口、属性和方法的所有信息，并可在运行时创建对象、修改属性（包括私有的）、调用方法（包括私有的）。
    反射机制的优点就是可以实现动态创建对象和编译，体现出很大的灵活性。
    java反射机制主要提供了以下功能
    在运行时判断任意一个对象所属的类
    在运行时构造任意一个类的对象
    在运行时判断任意一个类所具有的成员变量和方法
    在运行时调用任意一个对象的方法








*/



}
