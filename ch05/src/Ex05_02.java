import java.util.Scanner;

public class Ex05_02 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int big, small;

        System.out.println("두 정수의 최대공약수를 구합니다.");

        do {
            System.out.print("정수를 입력하세요.: ");
            big = stdIn.nextInt();
        } while (big <= 0);

        do {
            System.out.print("정수를 입력하세요.: ");
            small = stdIn.nextInt();
        } while (small <= 0);

        System.out.println("최대공약수는 " + gcd(big,small) + "입니다.");

    }

    static int gcd(int big, int small) {
        if (small == 0){
            return big;
        } else {
            return gcd(small, big % small);
        }
    }

}
