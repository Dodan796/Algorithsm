package backjoon;

import java.util.Scanner;

public class Back2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 필요한 변수 설정
        // 1-1. 입력할 값 3개
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 1-2. 입력된 값의 곱을 변수로 설정 ex). 5 * 3 * 2 = 30
        int price = a * b * c;

        // 1-3. price값의 숫자를 계산하기 위한 배열선언
        int count[] = new int[10];

        // 2. price값에 사용된 숫자를 세는 로직
        while (price > 0) {
            count[price % 10]++;
            price /= 10;
        }

        // 3. 2번 로직의 출력을 위한 로직.
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }

    }
}
