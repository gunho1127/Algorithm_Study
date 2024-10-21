import java.util.Scanner;

public class Q18_조건호 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int num;

        System.out.print("요솟수: ");
        num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: " );
            x[i] = stdIn.nextInt();
        }

        // 테스트를 위한 출력 구문
//        for (int i = 0; i < x.length; i++) {
//            System.out.println("x[" + i + "]: " + x[i]);
//        }

        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();

        int result = sequentialSearch(x, num, key);

        // 선형 검색 결과 출력
        if (result == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + result + "]에 있습니다.");
        }


    }

    static int sequentialSearch(int[] x, int num, int key) {

        int i = 0;

        while (true) {

            if (i == num) {
                return -1;
            }

            if (x[i] == key) {
                return i;
            }

            i++;

        }
    }

}
