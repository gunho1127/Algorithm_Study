import java.util.Scanner;

public class Q13_조건호 {

    static int maxOf(int[] a) {
        int max = a[0];

        for (int j = 0 ; j < a.length ; j++) {
            if (max < a[j]) {
                max = a[j];
            }
        }

        return max;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int max;

        System.out.println("키의 최댓값을 구합니다.");

        do {
            System.out.print("사람 수: ");
            n = scan.nextInt();
        } while (n <= 0) ;

        int[] height = new int[n];

        for (int i = 0 ; i < n ; i++) {
            System.out.print("height[" + i + "] : ");
            height[i] = scan.nextInt();
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");

    }
}
