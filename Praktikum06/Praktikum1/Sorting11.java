package Praktikum06.Praktikum1;

public class Sorting11 {
    public int[] data;
    public int jumData;
    
    public Sorting11(int[] data, int jmlData) {
        this.data = data;
        this.jumData = jmlData;
    }
    
    public void bubbleSort() {
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 1; j < jumData - i; j++) {
                if (data[j - 1] > data[j]) {
                    int tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
    }
    
    public void selectionSort() {
        for (int i = 0; i < jumData - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < jumData; j++) {
                if (data[j] < data[idxMin]) {
                    idxMin = j;
                }
            }
            // swap
            int tmp = data[idxMin];
            data[idxMin] = data[i];
            data[i] = tmp;
        }
    }
    
    public void insertionSort() {
        for (int i = 1; i < jumData; i++) {
            int temp = data[i];
            int j = i;
            while (j > 0 && data[j - 1] > temp) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
    }
    
    public void tampil() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}