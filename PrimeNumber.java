import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i;
        int j = sc.nextInt();
        for (i = 2; i < j; i++) {

            if (j % i == 0) {
                System.out.println("Number is not prime");
                break;
            }
        }
        if (i == j)
            System.out.println("Number is prime");

    }

}
