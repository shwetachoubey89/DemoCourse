import java.util.Scanner;

public class Sum1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int j = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= j; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of number is " + sum);
    }
}
