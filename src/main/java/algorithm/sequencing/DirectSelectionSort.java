package algorithm.sequencing;

/*
        -直接选择排序

      首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
        直接选择排序然后，再从剩余未排序元素中继续寻找最小（大）元素，
        然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕*/
public class DirectSelectionSort {

    public static void main(String[] args) {
        int[] a = { 2, 5, 5, 3, 9, 6, 1, 4, 8, 7 };
        select_sort(a);
        print_array(a);

    }

    public static void select_sort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    swap(a, i, j);
                }
            }
        }
    }

    public static void swap(int[] a, int b, int c) {
        if (b == c)
            return;
        a[b] = a[b] ^ a[c];
        a[c] = a[b] ^ a[c];
        a[b] = a[b] ^ a[c];
    }

    public static void print_array(int[] a) {
        if (a.length == 0)
            return;

        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
