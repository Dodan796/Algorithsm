import java.util.Scanner;

public class Back11720 {
    public static void main(String[] args) {

        //1. 배열 & 변수선언
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String num = sc.next();
        char[] nums = num.toCharArray();

        //2. 배열을 순회하며 각 자리수의 합
        for (int i = 0; i < n; i++) {
            sum += nums[i] - '0'; // 0의 ASKII = 48
        }

        System.out.println(sum);

        sc.close();

    }
}
