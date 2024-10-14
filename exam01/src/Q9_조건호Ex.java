import java.util.Scanner;

public class Q9_조건호Ex {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b;

        System.out.print("a의 값 : ");
        a = stdIn.nextInt();
        System.out.print("b의 값 : ");
        b = stdIn.nextInt();


        while (b <= a) {
            System.out.println("a보다 큰 값을 입력하세요!");
            System.out.print("b의 값 : ");
            b = stdIn.nextInt();
        }

        System.out.println("b - a는 " + (b-a) + "입니다.");
    }
}
