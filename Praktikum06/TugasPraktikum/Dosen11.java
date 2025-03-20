package Praktikum06.TugasPraktikum;

public class Dosen11 {
    private String kode;
    private String nama;
    private boolean jenisKelamin;
    private int usia;
    
    public Dosen11(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    
    public void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
    }
    
    public int getUsia() {
        return usia;
    }
}