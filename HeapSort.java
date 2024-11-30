public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;
        
        // Construir um heap máximo
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        
        // Extrair os elementos do heap um por um
        for (int i = n - 1; i >= 0; i--) {
            // Mover o maior elemento (root) para o final
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            // Chamar heapify para reconstruir o heap
            heapify(arr, i, 0);
        }
    }
    
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        // Verificar se o filho esquerdo é maior que o maior elemento
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        
        // Verificar se o filho direito é maior que o maior elemento
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        
        // Trocar e continuar heapificando se necessário
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        heapSort(arr);
        System.out.println("Array ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
