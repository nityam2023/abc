import java.util.Scanner;

public class SumSmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Finding the smallest and largest numbers
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));

        // Calculating and displaying the sum of smallest and largest
        int sum = smallest + largest;
        System.out.println("The sum of the smallest and largest numbers is: " + sum);

        scanner.close();
    }
}
