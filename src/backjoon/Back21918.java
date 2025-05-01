package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back21918 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //1. 전구의 갯수 N & 명령어의 갯수 M 입력받기
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //2. 전구의 배열 생성
        int bulbs[] = new int[N + 1];

        //3. N개 만큼의 전구배열 생성
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            bulbs[i] = Integer.parseInt(st.nextToken());
        }

        //4. 입력받은 명령어의 갯수만큼 명령 수행
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            switch (a) {
                case 1:
                    bulbs[b] = c;
                    break;

                case 2:
                    for (int i = b; i <= c; i++)
                        bulbs[i] ^= 1;
                    break;

                case 3:
                    for (int i = b; i <= c; i++)
                        bulbs[i] = 0;
                    break;

                case 4:
                    for (int i = b; i <= c; i++)
                        bulbs[i] = 1;
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++)
            sb.append(bulbs[i]).append(' ');
        System.out.println(sb);
    }
}
