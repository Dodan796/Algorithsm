package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Back9046 {
    public static void main(String[] args) throws IOException {

        //1. Scanner 대신 BufferReader 사용해보기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        //2. 문자열의 빈도수 구하기
        for (int i = 0; i < n; i++) {
            int[] result = new int[26]; // 알파벳 a~z까지 저장하는 배열
            char[] arr = br.readLine().toCharArray(); // 문자열 배열 arr에 대해 char배열(문자1개)로 전환

            //3. 각 문자의 빈도수 계산
            for (char a : arr) { // for (int i = 0; i < arr.length; i++) {char a = arr[i]; 후 a를 사용.} =>
                if (a >= 'a' && a <= 'z') {
                    result[a - 'a']++;
                }
            }

            //4. 가장 많은 알파벳의 빈도수 구하기
            int max = 0;
            for (int count : result) {
                if (count > max) {
                    max = count;
                }
            }

            //5. 가장 많은 알파벳의 갯수 세기
            int count = 0;
            int answer = 0;
            for (int j = 0; j < 26; j++) {
                if (result[j] == max) {
                    count++;
                    answer = j;
                }
            }

            //6. 예외처리
            sb.append(count == 1 ? (char) ('a' + answer) : "?").append(System.lineSeparator());
        }

        //7. 출력
        System.out.println(sb.toString());

    }
}
