public class SelectionSort {
    public static void selectionSort(int[] arr) {
        // Iterar sobre todos os elementos do array
        for (int i = 0; i < arr.length - 1; i++) {
            // Encontrar o menor elemento na parte não ordenada do array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Trocar o menor elemento encontrado com o elemento na posição i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Array ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
