import java.util.Scanner;

public class Back1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 변수선언
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 2. 입력된 두 수의 크기를 비교하는 로직
        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

    }
}
