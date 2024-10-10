import java.util.Scanner;

public class Q1_조건호 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // a,b,c 의 값 scanner 이용하여 입력
        System.out.println("세 정수의 최대값을 구합니다.");
        System.out.print("a 의 값 : ");
        int a = scan.nextInt();
        System.out.print("b 의 값 : ");
        int b = scan.nextInt();
        System.out.print("c 의 값 : ");
        int c = scan.nextInt();

        // 최대값을 저장하는 변수 max 선언, 초기값은 처음 입력받은 a
        int max = a;

        // if 문을 이용해서 최대값 max에 저장
        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        // 최대값 출력
        System.out.println("최대값은 " + max + "입니다.");

    }
}
