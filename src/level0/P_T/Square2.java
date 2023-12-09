package level0.P_T;
/*
어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때,
n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.

n	result
144	1
976	2
 */
public class Square2 {
    public int solution(int n) {
        return n % Math.sqrt(n) == 0 ? 1 : 2;
    }
}
