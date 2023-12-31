package K_O;

import java.util.Scanner;

/*
자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.

입력 #1   출력 #1
100     100 is even
입력 #2   출력 #2
1       1 is odd
 */
public class OdEvIs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + (n % 2 == 0 ? " is even" : " is odd"));
    }
}
