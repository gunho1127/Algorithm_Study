import java.util.Scanner;

public class Q14_조건호Ex {

    static void triangleLB(int n) {

        System.out.println("왼쪽 아래 직각삼각형");

        for (int j = 1 ; j <= n; j++){
            for (int k = 1 ; k <= j ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {

        System.out.println("왼쪽 위 직각삼각형");

        for (int j = n ; j >= 1; j--){
            for (int k = 1 ; k <= j ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {

        System.out.println("오른쪽 위 직각삼각형");

        for (int j = 1 ; j <= n; j++){
            for (int k = 1 ; k < j ; k++){
                System.out.print(" ");
            }
            for (int l = 1 ; l <= n-j+1 ; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {

        System.out.println("오른쪽 아래 직각삼각형");

        for (int j = 1 ; j <= n; j++){
            for (int k = 1 ; k <= n-j ; k++){
                System.out.print(" ");
            }
            for (int l = 1 ; l <= j ; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("삼각형을 출력합니다.");

        do {
            System.out.print("단수는 : ");
            n = scan.nextInt();
        } while (n <= 0) ;


        triangleLB(n);
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);




    }
}
