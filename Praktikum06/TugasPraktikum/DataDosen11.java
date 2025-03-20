package Praktikum06.TugasPraktikum;

public class DataDosen11 {
    private Dosen11[] dataDosen = new Dosen11[10];
    private int idx = 0;
    
    public void tambah(Dosen11 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    
    public void tampil() {
        for (int i = 0; i < idx; i++) {
            System.out.println("Data Dosen ke-" + (i+1));
            dataDosen[i].tampil();
            System.out.println("------------------------");
        }
    }
    
    public void sortingASC() {
        // Bubble Sort (ascending)
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j - 1].getUsia() > dataDosen[j].getUsia()) {
                    // swap
                    Dosen11 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }
    
    public void sortingDSC() {
        // Selection Sort (descending)
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].getUsia() > dataDosen[idxMax].getUsia()) {
                    idxMax = j;
                }
            }
            // swap
            Dosen11 tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }
    
    public void insertionSort() {
        // Insertion Sort (descending)
        for (int i = 1; i < idx; i++) {
            Dosen11 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].getUsia() < temp.getUsia()) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}