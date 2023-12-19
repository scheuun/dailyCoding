package F_J;

import java.util.Arrays;

/*
정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.

num_list	n	result
[2, 1, 6]	3	[6]
[5, 2, 1, 7, 5]	2	[2, 1, 7, 5]
 */
public class FromN {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}
