import java.util.Scanner;

public class trueorfalse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPositive = num > 0;
        boolean isNegative = num < 0;

        System.out.println("Is the number positive? " + isPositive);
        System.out.println("Is the number negative? " + isNegative);
    }
}
