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
        System.out.println("Program finished.");
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
}git status