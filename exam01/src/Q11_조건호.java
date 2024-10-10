import java.util.Scanner;

public class Q11_조건호 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("----- 구구단 곱셈표 -----");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

//        for (int i = 1; i <= 9 ; i++) {
//            System.out.print(" ");
//            for (int j = 1; j <= 9 ; j++) {
//                if (i*j < 10) {
//                    System.out.print(" " + i*j + " ");
//                } else {
//                    System.out.print(i*j + " ");
//                }
//            }
//            System.out.println();
//        }

    }
}