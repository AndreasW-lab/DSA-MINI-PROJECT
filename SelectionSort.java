public class SelectionSort {

    public static void sort(int[] numbers) {

        int comparisons = 0;
        int swaps = 0;

        for (int i = 0; i < numbers.length - 1; i++) {

            int smallest = i;

            
            for (int j = i + 1; j < numbers.length; j++) {

                comparisons++;

                if (numbers[j] < numbers[smallest]) {
                    smallest = j;
                }
            }

            
            if (smallest != i) {

                int temp = numbers[i];
                numbers[i] = numbers[smallest];
                numbers[smallest] = temp;

                swaps++;
            }

            
            if (i < 3) {
                System.out.print("Pass " + (i + 1) + ": ");

                for (int k = 0; k < numbers.length; k++) {
                    System.out.print(numbers[k] + " ");
                }

                System.out.println();
            }
        }

        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
    }
}