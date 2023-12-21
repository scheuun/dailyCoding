package A_E;

import java.util.Arrays;

/*
정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고,
50보다 작은 홀수라면 2를 곱합니다. 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.

arr	result
[1, 2, 3, 100, 99, 98]	[2, 2, 6, 50, 99, 49]
 */
public class ConArr1 {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr).map(i -> (i >= 50 && i % 2 == 0) ? i / 2 :
                                    (i < 50 && i % 2 == 1) ? i * 2 : i)
                                .toArray();
    }
}
