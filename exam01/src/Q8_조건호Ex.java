import java.util.Scanner;

public class Q8_조건호Ex {

    static int sumof(int a, int b){

        int min;
        int max;

        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        int sum = 0;

        for (int i = min; i <= max; i++){
            sum += i;
        }

        return sum;

    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int a, b;

        System.out.println("a와 b를 포함하여 그 사이에 있는 모든 정수의 총합을 구합니다.");

        System.out.print("a의 값 : ");
        a = stdIn.nextInt();

        System.out.print("b의 값 : ");
        b = stdIn.nextInt();

        System.out.println("정수 a, b 사이의 모든 정수의 총합은 " + sumof(a, b) + "입니다.");

    }

}
