import java.util.Scanner;

public class Q3_조건호 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("정수를 입력하세요.: ");
        num = scan.nextInt();

        if (num < 0) {
            System.out.print("이 수는 음수입니다.");
        } else if (num > 0) {
            System.out.print("이 수는 양수입니다.");
        } else {
            System.out.print("이 수는 0입니다.");
        }
    }
}
