import java.util.Scanner;

public class Q20_조건호 {

    static int Fact(int n) {
        if (n > 0) {
            return n * Fact(n-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.print("정수를 입력하세요 : ");
        n = scan.nextInt();

        System.out.println(n + "의 팩토리얼은 " + Fact(n) + "입니다.");

    }
}
