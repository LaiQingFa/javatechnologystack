package basic_;

/**
 * Collections.sort方法使用的是哪种排序方法
 */
public class Collections_sort {


/*
http://blog.csdn.net/tjcyjd/article/details/6804690

Comparator是个接口，可重写compare()及equals()这两个方法,用于比价功能；如果是null的话，就是使用元素的默认顺序，如a,b,c,d,e,f,g，就是a,b,c,d,e,f,g这样，当然数字也是这样的。

compare（a,b）方法:根据第一个参数小于、等于或大于第二个参数分别返回负整数、零或正整数。
equals（obj）方法：仅当指定的对象也是一个 Comparator，并且强行实施与此 Comparator 相同的排序时才返回 true。

Collections.sort(list, new PriceComparator());的第二个参数返回一个int型的值，就相当于一个标志，告诉sort方法按什么顺序来对list进行排序。


一、Collections工具类两种sort()方法   自然排序和自定义比较器排序

      http://www.cnblogs.com/xiaoxing/p/5977810.html

格式一： public static <T extends Comparable<? super T>> void sort(List<T> list)

说明：该方法中的泛型<T>都是Comparable接口的子类，即只有是Comparable接口子类类型的数据，才能进行比较排序。如果其他类型的数据要进行比较排序，必须继承Comparable接口并

覆写equals()和compareTo()方法。其中如String类、Integer类都是Comparable接口子类，可以进行排序，而基本类型不能进行sort排序。比较项目在类内指定



格式二：public static <T> void sort(List<T> list, Comparator<? super T> c)

说明：该方法中指定比较方式Comparator<? super T> c，即c必须实现Comparator<? super T>接口，覆写compareTo()方法指定比较项目。比较项目在类外指定，比较灵活

*/


}
