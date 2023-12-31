package K_O;
/*
양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.

n	result
7	16
10	220
 */
public class OdEvRes {
    public int solution(int n) {
        int answer = 0;

        if (n % 2 != 0) {
            return (int) Math.pow((n + 1) / 2, 2);
        }

        for (int i = 2; i <= n; i += 2) {
            answer += Math.pow(i, 2);
        }

        return answer;
    }
}
