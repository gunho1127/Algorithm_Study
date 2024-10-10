import java.util.Scanner;

public class Q7_조건호 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n;
        int sum = 0;

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        n = scan.nextInt();


        for (int i = 1 ; i <= n ; i++) {
            sum += i;
            if (i < n){
                System.out.print(i + " + ");
            } else {
                System.out.println(i + " + = " + sum);
            }
        }

    }
}