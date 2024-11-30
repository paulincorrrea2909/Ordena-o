public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Passar por todos os elementos do array
        for (int i = 0; i < n - 1; i++) {
            // Últimos elementos já estão na posição correta após cada passagem
            for (int j = 0; j < n - i - 1; j++) {
                // Trocar se o elemento encontrado for maior que o próximo
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Array ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
