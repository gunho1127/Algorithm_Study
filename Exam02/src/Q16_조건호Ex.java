import java.util.Scanner;

public class Q16_조건호Ex {

    static void npira(int n) {

        for (int i = 1 ; i <= n; i++){
            for (int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }

            for (int k = 1 ; k <= 2*i - 1 ; k++){
                System.out.print(i);
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        long beforeTime = System.currentTimeMillis();

        System.out.println("피라미드를 출력합니다.");

        do {
            System.out.print("단수는 : ");
            n = scan.nextInt();
        } while (n <= 0) ;


        npira(n);





    }
}
