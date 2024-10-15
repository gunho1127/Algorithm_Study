
import java.util.*;

public class Q14_조건호Ex_ver2 {

    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("삼각형을 출력합니다.");
        while(true){
            try {
                System.out.print("단수는 : ");
                n = sc.nextInt();
            } catch (Exception e){
                sc.nextLine();
                continue;
            }

            if (n > 0) break;
        }

        triangleLB(n);
        System.out.println("--------------------------------------");
        triangleLU(n);
        System.out.println("--------------------------------------");
        triangleRU(n);
        System.out.println("--------------------------------------");
        triangleRB(n);
    }

    static void triangleLB(int n){
        String format = "%-" + n + "s";
        for (int i=1; i<=n; i++){
            System.out.printf(format, "*".repeat(i));
            System.out.println();
        }
    }

    static void triangleLU(int n){
        String format = "%-" + n + "s";
        for (int i=n; i>0; i--){
            System.out.printf(format, "*".repeat(i));
            System.out.println();
        }
    }

    static void triangleRU(int n){
        String format = "%" + n + "s";
        for (int i=1; i<=n; i++){
            System.out.printf(format, "*".repeat(i));
            System.out.println();
        }
    }

    static void triangleRB(int n){
        String format = "%" + n + "s";
        for (int i=n; i>0; i--){
            System.out.printf(format, "*".repeat(i));
            System.out.println();
        }
    }
}
