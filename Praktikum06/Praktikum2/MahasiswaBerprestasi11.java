package Praktikum06.Praktikum2;

public class MahasiswaBerprestasi11 {
    Mahasiswa11 listMhs[] = new Mahasiswa11[5];
    int idx;
    
    public void tambah(Mahasiswa11 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    
    public void tampil() {
        for (Mahasiswa11 m : listMhs) {
            m.tampilInformasi();
            System.out.println("------------------------");
        }
    }
    
    public void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j - 1].getIpk() < listMhs[j].getIpk()) {
                    // swap
                    Mahasiswa11 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    public void selectionSortAscending() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].getIpk() < listMhs[idxMin].getIpk()) {
                    idxMin = j;
                }
            }
            // swap
            Mahasiswa11 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    
    public void insertionSortDescending() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa11 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].getIpk() < temp.getIpk()) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
