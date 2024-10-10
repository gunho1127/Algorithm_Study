import java.util.Scanner;

public class Q2_조건호 {
    static int med(int a, int b, int c) {
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            return a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a;
        int b;
        int c;

        // a,b,c 의 값 scanner 이용하여 입력
        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a 의 값 : ");
        a = scan.nextInt();
        System.out.print("b 의 값 : ");
        b = scan.nextInt();
        System.out.print("c 의 값 : ");
        c = scan.nextInt();

        System.out.println("중앙값은 " + med(a,b,c) + "입니다.");



    }
}
