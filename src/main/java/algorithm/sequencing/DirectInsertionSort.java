package algorithm.sequencing;

/**
 * 插入排序
 * 平均O(n^2),最好O(n),最坏O(n^2);空间复杂度O(1);稳定;简单
 * @author zeng
 *
 */
public class DirectInsertionSort {

    public static void insertionSort(int[] a) {
        int tmp;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    tmp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

  /*

   测试：
   public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
        insertionSort(a);
        for (int i : a)
            System.out.print(i + " ");
    }*/
}
    /*
    思想：

    直接插入排序(straight insertion sort)的做法是：
        每次从无序表中取出第一个元素，把它插入到有序表的合适位置，使有序表仍然有序。
        第一趟比较前两个数，然后把第二个数按大小插入到有序表中；
        第二趟把第三个数据与前两个数从后向前扫描，把第三个数按大小插入到有序表中；
        依次进行下去，进行了(n-1)趟扫描以后就完成了整个排序过程。
        直接插入排序是由两层嵌套循环组成的。外层循环标识并决定待比较的数值。
        内层循环为待比较数值确定其最终位置。
        直接插入排序是将待比较的数值与它的前一个数值进行比较，所以外层循环是从第二个数值开始的。
        当前一数值比待比较数值大的情况下继续循环比较，
        直到找到比待比较数值小的并将待比较数值置入其后一位置，结束该次循环。
        插入排序的基本方法是：每步将一个待排序的记录按其关键字的大小插到前面
        已经排序的序列中的适当位置，直到全部记录插入完毕为止。*/