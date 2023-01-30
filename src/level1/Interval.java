package level1;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
함수 solution은 정수 x와 자연수 n을 입력 받아,
x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

입출력 예 #1
2	5	[2,4,6,8,10]
입출력 예 #2
4	3	[4,8,12]
입출력 예 #3
-4	2	[-4, -8]
 */
public class Interval {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < n; i++) {
            answer[i] = (long)(1+i)*x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Interval i = new Interval();
        System.out.println(Arrays.toString(i.solution(1, 2)));
    }
}
