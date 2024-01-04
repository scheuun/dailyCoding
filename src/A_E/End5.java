package A_E;

import java.util.Arrays;
/*
정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

num_list	result
[12, 4, 15, 46, 38, 1, 14]	[1, 4, 12, 14, 15]
 */
public class End5 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 0, 5);
    }
}
