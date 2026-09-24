public class InsertionSort {

    public static void sort(int[] numbers) {

        int comparisons = 0;
        int shifts = 0;

        for (int i = 1; i < numbers.length; i++) {

            int current = numbers[i];
            int j = i - 1;

            
            while (j >= 0) {

                comparisons++;

                if (numbers[j] > current) {

                    numbers[j + 1] = numbers[j];
                    shifts++;

                    j--;

                } else {
                    break;
                }
            }

            
            numbers[j + 1] = current;

            
            if (i <= 3) {

                System.out.print("Pass " + i + ": ");

                for (int k = 0; k < numbers.length; k++) {
                    System.out.print(numbers[k] + " ");
                }

                System.out.println();
            }
        }

        System.out.println("Comparisons: " + comparisons);
        System.out.println("Shifts: " + shifts);
    }
}