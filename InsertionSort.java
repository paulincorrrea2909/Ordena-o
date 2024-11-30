public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  // Elemento a ser inserido na posição correta
            int j = i - 1;
            // Mover os elementos maiores que o key para uma posição à frente
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Inserir o key na posição correta
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("Array ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
