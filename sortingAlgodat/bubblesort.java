public class bubblesort {
       // Method untuk melakukan bubble sort
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Looping untuk setiap elemen
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Bandingkan elemen berurutan
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar posisi jika salah urut
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Jika tidak ada pertukaran, array sudah terurut
            if (!swapped) break;
        }
    }

    // Method untuk menampilkan array
    public void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
