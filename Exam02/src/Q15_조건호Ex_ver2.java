import java.util.Scanner;

public class Q15_조건호Ex_ver2 {

    static void spira(int n) {

        for (int i = 1 ; i <= n; i++) {
            String space = " ".repeat(n - i);
            String stars = "*".repeat(2 * i - 1);
            System.out.println(space + stars);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.println("피라미드를 출력합니다.");

        do {
            System.out.print("단수는 : ");
            n = scan.nextInt();
        } while (n <= 0);

        spira(n);
    }
}