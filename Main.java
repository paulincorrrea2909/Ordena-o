import java.util.Scanner;

public class Main {

    // Função para exibir o menu
    public static void displayMenu() {
        System.out.println("Escolha o algoritmo de ordenação que deseja testar:");
        System.out.println("1. Selection Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Bubble Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
        System.out.println("6. Heap Sort");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    }

    // Função para gerar um array de números aleatórios para os testes
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int arraySize = 10; // Tamanho do array para os testes
        int choice;

        // Exemplo de array de teste
        arr = generateRandomArray(arraySize);
        System.out.println("Array original:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Loop do menu
        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Executar Selection Sort
                    int[] selectionSortArr = arr.clone();
                    SelectionSort.selectionSort(selectionSortArr);
                    System.out.println("Array ordenado com Selection Sort:");
                    for (int num : selectionSortArr) {
                        System.out.print(num + " ");
                    }
                    System.out.println("\n");
                    break;

                case 2:
                    // Executar Insertion Sort
                    int[] insertionSortArr = arr.clone();
                    InsertionSort.insertionSort(insertionSortArr);
                    System.out.println("Array ordenado com Insertion Sort:");
                    for (int num : insertionSortArr) {
                        System.out.print(num + " ");
                    }
                    System.out.println("\n");
                    break;

                case 3:
                    // Executar Bubble Sort
                    int[] bubbleSortArr = arr.clone();
                    BubbleSort.bubbleSort(bubbleSortArr);
                    System.out.println("Array ordenado com Bubble Sort:");
                    for (int num : bubbleSortArr) {
                        System.out.print(num + " ");
                    }
                    System.out.println("\n");
                    break;

                case 4:
                    // Executar Merge Sort
                    int[] mergeSortArr = arr.clone();
                    MergeSort.mergeSort(mergeSortArr);
                    System.out.println("Array ordenado com Merge Sort:");
                    for (int num : mergeSortArr) {
                        System.out.print(num + " ");
                    }
                    System.out.println("\n");
                    break;

                case 5:
                    // Executar Quick Sort
                    int[] quickSortArr = arr.clone();
                    QuickSort.quickSort(quickSortArr, 0, quickSortArr.length - 1);
                    System.out.println("Array ordenado com Quick Sort:");
                    for (int num : quickSortArr) {
                        System.out.print(num + " ");
                    }
                    System.out.println("\n");
                    break;

                case 6:
                    // Executar Heap Sort
                    int[] heapSortArr = arr.clone();
                    HeapSort.heapSort(heapSortArr);
                    System.out.println("Array ordenado com Heap Sort:");
                    for (int num : heapSortArr) {
                        System.out.print(num + " ");
                    }
                    System.out.println("\n");
                    break;

                case 7:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (choice != 7);

        scanner.close();
    }
}
