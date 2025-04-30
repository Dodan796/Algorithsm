package backjoon;

import java.util.Scanner;

public class Back10808 {
    public static void main(String[] args) {
        // 백준 10808
        // 문제: 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.

        // 1. Scanner 객체를 사용하여 문자열 입력 받기
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // 2. a~z까지 알파벳의 개수를 저장할 배열 선언 (총 26개)
        int[] d = new int[26];

        // 3. 문자열 s의 길이만큼 한 글자씩 확인하며 알파벳 개수를 증가
        for (int i = 0; i < s.length(); i++) {
            // 3-1. 현재 문자의 알파벳 순서를 계산 ('a'의 아스키코드 값 97)
            d[s.charAt(i) - 97]++;
            //=> 코드해석:
            // 1. d배열의 입력되는 문자열 s의 i번째 문자를 가져온다.
            // 2. 가져온 문자에서 a의 아스키코드 97을 뺀다 / 예): c: 99-97 =2 (c는 index 2의 위치에 배치)
            // 3. 해당 index를 1증가.
        }

        // 4. 배열에 저장된 알파벳 개수를 공백으로 구분하여 출력
        for (int i = 0; i < 26; i++) {
            // 4-1.각 값을 출력, 공백으로 구분
            System.out.print(d[i] + " ");
        }
    }
}
