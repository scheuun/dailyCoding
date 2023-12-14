package level0.K_O;
/*
정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

n	result
10	[1, 3, 5, 7, 9]
15	[1, 3, 5, 7, 9, 11, 13, 15]
 */
public class NotEven {
    public int[] solution(int n) {
        int[] answer = new int[ n % 2 == 0 ? n /2 : n / 2 + 1];

        for (int i = 1; i <= n; i += 2) {
            answer[i / 2] = i;
        }

        return answer;
    }
}
