package A_E;
/*
정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.

num_list	result
[3, 4, 5, 2, 1]	393
[5, 7, 8, 3]	581
 */
public class AttNum {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";

        for (int i : num_list) {
            if (i % 2 != 0) {
                odd += i;
            } else {
                even += i;
            }
        }

        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}
