package Praktikum06.Praktikum1;

import java.util.Scanner;

public class SortingMain11 {
    public static void main(String[] args) {
        int a[] = {15, 10, 7, 22, 5};
        Sorting11 dataurut1 = new Sorting11(a, a.length);
        
        System.out.println("Data Awal 1:");
        dataurut1.tampil();
        
        dataurut1.bubbleSort();
        
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC):");
        dataurut1.tampil();
        
        // Menambahkan to SortingMain11.java
        int b[] = {18, 7, 9, 25, 3, 12};
        Sorting11 dataurut2 = new Sorting11(b, b.length);

        System.out.println("\nData Awal 2:");
        dataurut2.tampil();

        dataurut2.selectionSort();

        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC):");
        dataurut2.tampil();

        // Menambahkan SortingMain11.java
        int c[] = {18, 7, 9, 25, 3, 12};
        Sorting11 dataurut3 = new Sorting11(c, c.length);

        System.out.println("\nData Awal 3:");
        dataurut3.tampil();

        dataurut3.insertionSort();

        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC):");
        dataurut3.tampil();
    }
}