import java.util.Scanner;

public class Q9_조건호 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n;
        int w;

        System.out.println("*을 n개 출력하되 w개마다 줄바꿈하기");

        do {
            System.out.print("n값: ");
            n = scan.nextInt();
        } while (n <= 0);

        do {
            System.out.print("w값: ");
            w = scan.nextInt();
        } while (w <= 0 || w > n);



        for (int i = 1 ; i <= n ; i++) {
            if (i % w == 0) {
                System.out.print("*\n");
            } else {
                System.out.print("*");
            }
        }

    }
}