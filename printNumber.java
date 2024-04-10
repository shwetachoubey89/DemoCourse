import java.util.Scanner;

public class printNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int j = sc.nextInt();
        for (int i = 0; i < j; i++) {
            System.out.println(i);
        }
    }
}
