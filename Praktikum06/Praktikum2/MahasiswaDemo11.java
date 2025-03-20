package Praktikum06.Praktikum2;

import java.util.Locale;
import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Ensure the use of a decimal point
        Scanner scanner = new Scanner(System.in);
        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11();
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Kelas: ");
            String kelas = scanner.nextLine();
            System.out.print("IPK: ");
            String ipkInput = scanner.nextLine();
            ipkInput = ipkInput.replace(',', '.'); // Replace comma with dot if necessary
            double ipk = Double.parseDouble(ipkInput);
            
            Mahasiswa11 mahasiswa = new Mahasiswa11(nim, nama, kelas, ipk);
            list.tambah(mahasiswa);
        }
        
        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();
        
        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) dengan Bubble Sort:");
        list.bubbleSort();
        list.tampil();
        

        System.out.println("Data yang sudah terurut menggunakan SELECTION SHORT (ASC):");
        list.selectionSortAscending();
        list.tampil();
        

        System.out.println("Data yang sudah terurut menggunakan INSERTION SHORT (ASC):");
        list.insertionSortAscending();
        list.tampil();
        
        scanner.close();
    }
}