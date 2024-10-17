import java.util.Scanner;

public class Q14_조건호 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소 수: ");
        int elementCount = scanner.nextInt();

        int[] x = new int[elementCount];

        for (int i = 0; i < elementCount; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        for (int i = 0; i < elementCount / 2; i++) {
            int temp = x[i];
            x[i] = x[elementCount - i - 1];
            x[elementCount - i - 1] = temp;
        }

        System.out.print("요소를 역순으로 정렬했습니다.\nx = [");
        for (int i = 0; i < elementCount; i++) {
            System.out.print(x[i]);
            if (i < elementCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}
