import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.isBlank()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        System.out.println("Hello, " + name + "!");
        int[] numbers = {4, 7, 1, 9};
        System.out.println("Minimum value: " + calculateMin(numbers));
        System.out.println("Application has ended successfully.");
    }

    public static double calculateAverage(int[] values) {
        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        return (double) sum / values.length;
    }

    public static int calculateMax(int[] values) {
        int max = values[0];

        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static int calculateMin(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        int min = values[0];

        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }
}