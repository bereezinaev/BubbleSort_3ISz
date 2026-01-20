public class BubbleSort {
    // Функция сортировки пузырьком
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Меняем элементы местами
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
            n--; // Оптимизация: сокращаем длину прохода
        } while (swapped);
    }

    // Функция печати массива
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Главный метод
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Исходный массив:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("Отсортированный массив:");
        printArray(numbers);
    }
}