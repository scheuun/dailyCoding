package F_J;

import java.util.Arrays;

/*
정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.

num_list	n	result
[1, 2, 3, 4, 5]	3	1
[15, 98, 23, 2, 15]
 */
public class FindInt {
    public int solution(int[] num_list, int n) {
        return  Arrays.stream(num_list).anyMatch(i -> i == n) ? 1 : 0;
    }
}
