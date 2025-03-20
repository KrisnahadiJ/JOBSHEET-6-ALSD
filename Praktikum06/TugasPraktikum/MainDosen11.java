package Praktikum06.TugasPraktikum;
import java.util.Scanner;

public class MainDosen11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen11 data = new DataDosen11();
        int pilih = 0;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    boolean jk = sc.nextLine().equalsIgnoreCase("L");
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    
                    Dosen11 d = new Dosen11(kode, nama, jk, usia);
                    data.tambah(d);
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Data telah diurutkan ASC");
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data telah diurutkan DSC");
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}