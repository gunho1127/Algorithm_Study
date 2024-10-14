import java.util.Scanner;

public class Q10_조건호Ex {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        int cnt = 0;

        System.out.println("양의 정수값의 자릿수를 구합니다.");
        System.out.print("정수값 : ");
        n = stdIn.nextInt();

        while (true) {
            if (n == 0) {
                break;
            }
            n = n / 10;  // 숫자 n을 10으로 나누고 그 값을 다시 숫자 n에 대입한다.
            cnt++;
        }


        System.out.println("그 수는 " + cnt + "자리입니다.");
    }
}

