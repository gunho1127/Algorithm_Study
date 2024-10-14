import java.util.Scanner;

public class Q13_조건호Ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("정사각형을 출력합니다.");
        System.out.print("변의 길이 : ");
        n = scan.nextInt();


        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= n ; j++){
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}

