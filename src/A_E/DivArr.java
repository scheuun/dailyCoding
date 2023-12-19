package A_E;

import java.util.ArrayList;
import java.util.List;
/*
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]
 */
public class DivArr {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i:arr) if (i % divisor == 0) list.add(i);

        if (list.size() == 0) list.add(-1);

        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        DivArr d = new DivArr();
        int[] arr = new int[]{5, 9, 7, 10};
        for (int i=0; i<d.solution(arr, 5).length; i++) {
            System.out.println(d.solution(arr, 5)[i]);
        }
    }
}
