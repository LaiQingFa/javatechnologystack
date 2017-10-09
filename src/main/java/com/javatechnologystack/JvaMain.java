package com.javatechnologystack;

import algorithm.sequencing.DirectInsertionSort;

public class JvaMain {

    public static void main(String args[]) {
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
        DirectInsertionSort.insertionSort(a);
        for (int i : a)
            System.out.print(i + " ");
    }
}
