import java.util.Scanner;

public class Q19_조건호 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int num;

        do {
            System.out.print("요솟수: ");
            num = stdIn.nextInt();
        } while(num <= 0);

        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {

            do {
                System.out.print("x[" + i + "]: ");
                x[i] = stdIn.nextInt();
            } while(x[i] < x[i - 1]);

        }

//        // 테스트를 위한 출력 구문
//        for (int i = 0; i < x.length; i++) {
//            System.out.println("x[" + i + "]: " + x[i]);
//        }

        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();

        int result = binarySearch(x, num, key);

        // 이진 검색 출력
        if (result == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + result + "]에 있습니다.");
        }


    }

    static int binarySearch(int[] x, int num, int key){

        int pl = 0;
        int pr = num - 1;

        do {

            int pc = (pl + pr) / 2;

            if (x[pc] < key) {
                pl = pc + 1;
            } else if (x[pc] > key) {
                pr = pc - 1;
            } else {
                return pc;
            }

        } while (pl <= pr);

        return -1;
    }

}
