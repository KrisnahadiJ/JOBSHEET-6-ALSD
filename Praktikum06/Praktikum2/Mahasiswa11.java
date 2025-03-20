package Praktikum06.Praktikum2;

public class Mahasiswa11 {
    private String nim;
    private String nama;
    private String kelas;
    private double ipk;
    
    public Mahasiswa11() {
    }
    
    public Mahasiswa11(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    
    public void tampilInformasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
    
    public double getIpk() {
        return ipk;
    }
}