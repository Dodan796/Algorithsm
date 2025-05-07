package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1978 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1. 입력받을 숫자의 갯수 & 소수의 갯수를 저장하는 변수 선언
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        // 간단한 배열형태로 저장하는 StringTokenizer 메서드
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        //2. 입력받은 숫자의 갯수만큼 배열 생성
        for (int i = 0; i < N; i++) {
            if (isPrime(Integer.parseInt(st.nextToken())))
                count++;

        }

        System.out.println(count);


    }

    //3. 소수인지 판명하는 코드 작성
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}
