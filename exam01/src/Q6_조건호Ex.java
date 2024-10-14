import java.util.Scanner;

public class Q6_조건호Ex {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n;
        int sum = 0;
        int i = 1;

        System.out.println("1부터 n까지의 총합을 구합니다.");
        System.out.print("n의 값 : ");
        n = scan.nextInt();

        while(i <= n){
            sum += i;
            i++;
        }

        System.out.println("1부터" + n +"까지의 총합은" + sum + "입니다.");
        System.out.print("i의 값은 " + i +"(으)로 됩니다.");

    }
}