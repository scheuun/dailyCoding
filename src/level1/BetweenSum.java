package level1;
/*
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

입출력 예 #1
3	5	12
3	3	3
5	3	12
 */
public class BetweenSum {
    public long solution(int a, int b) {
        long answer = 0;
        if (a<b) {
            for (int i=a; i<=b; i++) {
                answer+=i;
            }
        } else if (a>b) {
            for (int i=b; i<=a; i++) {
                answer+=i;
            }
        } else {
            answer = a;
        }
        return answer;
    }
}
