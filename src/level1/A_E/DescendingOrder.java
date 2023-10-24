package level1.A_E;

import java.util.Arrays;
import java.util.Collections;

/*
함수 solution은 정수 n을 매개변수로 입력받습니다.
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
예를들어 n이 118372면 873211을 리턴하면 됩니다.

입출력 예 #1
118372	873211
 */
public class DescendingOrder {
    public long solution(long n) {
        String s = Long.toString(n);
        long answer = 0;
        String[] arr = new String[s.length()];

        for (int i = 0; i<arr.length; i++) {
            arr[i] = String.valueOf(s.charAt(i));
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i=0; i<s.length(); i++) {
            answer += Integer.parseInt(String.valueOf(arr[s.length()-i-1])) * Math.pow(10, i);
        }

        return answer;
    }

    public static void main(String[] args) {
        DescendingOrder d = new DescendingOrder();
        System.out.println(d.solution(118372));
    }
}
