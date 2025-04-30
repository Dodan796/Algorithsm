package backjoon;

import java.util.Scanner;

public class Back10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 갯수세는 변수 Count를 0으로 초기화
        int count = 0;
        //1-1. 첫번째 입력값
        int N = sc.nextInt();
        //1-2. 입력값을 arr 배열에 넣기
        int[] arr = new int[N];

        //2. 입력된 N만큼 배열안에 정수 삽입.
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        //3. 갯수를 구할 정수 입력
        int b = sc.nextInt();

        //4. arr배열의 크기만큼 반복
        for (int j = 0; j < arr.length; j++) {
            if (b == arr[j]) {
                count++;
            }
        }
        System.out.println(count);

    }
}
