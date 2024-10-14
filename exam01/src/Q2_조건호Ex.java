import java.util.Scanner;

public class Q2_조건호Ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("세 정수의 최솟값을 구합니다.");
        System.out.print("a 의 값 : ");
        int a = scan.nextInt();
        System.out.print("b 의 값 : ");
        int b = scan.nextInt();
        System.out.print("c 의 값 : ");
        int c = scan.nextInt();

        int min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        System.out.println("최솟값은 " + min + "입니다.");

    }
}

