import java.util.Scanner;

public class Ex01_05 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.print("정수를 입력하세요.: ");
        n = stdIn.nextInt();

        if (n == 1) {
            System.out.println("A");
        } else if (n == 2) {
            System.out.println("B");
        } else if (n == 3) {
            System.out.println("C");
        }

    }

}
