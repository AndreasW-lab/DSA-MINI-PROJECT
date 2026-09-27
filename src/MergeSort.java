public class MergeSort {

    public static void sort(int[] numbers) {
        mergeSort(numbers, 0, numbers.length - 1);
    }


    public static void mergeSort(int[] numbers, int left, int right) {

        
        if (left < right) {

            int middle = (left + right) / 2;

            
            mergeSort(numbers, left, middle);

            
            mergeSort(numbers, middle + 1, right);

            
            merge(numbers, left, middle, right);
        }
    }


    public static void merge(int[] numbers, int left, int middle, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = middle + 1;
        int k = 0;

        
        while (i <= middle && j <= right) {

            if (numbers[i] < numbers[j]) {
                temp[k] = numbers[i];
                i++;
            } else {
                temp[k] = numbers[j];
                j++;
            }

            k++;
        }

        
        while (i <= middle) {
            temp[k] = numbers[i];
            i++;
            k++;
        }

        
        while (j <= right) {
            temp[k] = numbers[j];
            j++;
            k++;
        }

        
        for (int x = 0; x < temp.length; x++) {
            numbers[left + x] = temp[x];
        }
    }
}