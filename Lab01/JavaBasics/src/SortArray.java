import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] my_array1 = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            my_array1[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(my_array1));

        Arrays.sort(my_array1);
        System.out.println("Sorted array:   " + Arrays.toString(my_array1));

        long sum = 0;
        for (int value : my_array1) {
            sum += value;
        }
        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.printf("Average = %.2f%n", average);

        sc.close();
    }
}