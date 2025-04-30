package backjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Back14467 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1. 변수선언
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        //2. 입력할 정수
        int n = Integer.parseInt(br.readLine());

        //3. n개의 갯수만큼 소의 번호 + 위치값 입력받기
        for (int i = 0; i < n; i++) {

            // 3-1 소의 번호 & 위치 입력받기.
            String input[] = br.readLine().split(" ");
            int cow = Integer.parseInt(input[0]);
            int pos = Integer.parseInt(input[1]);

            if (map.containsKey(cow)) {
                if (map.get(cow) != pos) {
                    count++;
                    map.put(cow, pos);
                }
            } else {
                map.put(cow, pos);
            }
        }

        System.out.println(count);

    }
}
