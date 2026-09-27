public class QuickSort {

    public static void sort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
    }


    public static void quickSort(int[] numbers, int low, int high) {

        if (low < high) {

            int pivotPosition = partition(numbers, low, high);

            
            quickSort(numbers, low, pivotPosition - 1);

            
            quickSort(numbers, pivotPosition + 1, high);
        }
    }


    public static int partition(int[] numbers, int low, int high) {

        
        int pivot = numbers[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (numbers[j] <= pivot) {

                i++;

                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }

        
        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[high];
        numbers[high] = temp;

        return i + 1;
    }
}