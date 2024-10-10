import java.util.Scanner;

public class Q8_조건호 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");
        System.out.print("n값: ");
        n = scan.nextInt();


        for (int i = 1 ; i <= n ; i++) {
            if (i % 2 == 1){
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }

    }
}