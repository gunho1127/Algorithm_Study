import java.util.Scanner;

public class Q7_조건호Ex {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1에서 n까지의 총합을 구합니다.");
        System.out.print("n의 값 : ");
        n = stdIn.nextInt();

        int sum = (n+1) * (n/2) + (n%2 == 1 ?(n+1)/2 : 0);

        System.out.println("1에서 " + n + "까지의 총합은 " + sum + "입니다.");


    }

}
