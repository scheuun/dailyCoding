package A_E;
/*
정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

n	result
10	30
4	6
 */
public class EvenSum {
    public int solution(int n) {
        return (int) (Math.pow(n / 2, 2) + n / 2);
    }
}
