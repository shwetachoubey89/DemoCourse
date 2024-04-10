import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int j = sc.nextInt();

        if (j % 2 == 0)
            System.out.println(j + " Number is even");
        else
            System.out.println(j + " Number is odd");

    }
}
