import java.util.Scanner;

public class Q14_조건호 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int num;

        do {
            System.out.print("요솟수: ");
            num = stdIn.nextInt();
        } while (num <= 0);

        // 동적 배열
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i +"] : ");
            x[i] = stdIn.nextInt();
        }

        // 출력을 위한 테스트 구문
//        for (int i = 0; i < num; i++) {
//            System.out.println("x[" + i +"] : " + x[i]);
//        }



    }

    // 역순 정렬
    static void reverse(int x) {

    }

    // 데이터 교환
    static void swap(int[] x, int idx1, int idx2){

    }

}
