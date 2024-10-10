import java.util.Scanner;

public class Q6_조건호 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n;
        int sum = 0;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n값: ");
            n = scan.nextInt();
        } while (n <= 0);

        for (int i = 1 ; i <= n ; i++) {
            sum += i;
        }


        System.out.print("1부터 " + n +"까지의 합은 " + sum + "입니다.");

    }
}