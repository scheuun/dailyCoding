package K_O;

import java.util.Arrays;

/*
문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중
최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

입출력 예 #1
"1 2 3 4"	"1 4"
"-1 -2 -3 -4"	"-4 -1"
"-1 -1"	"-1 -1"
 */
public class MaxMin {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] answer = new int[str.length];

        for (int i=0; i<str.length; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(answer);

        return answer[0]+" "+answer[answer.length-1];
    }

    public static void main(String[] args) {
        MaxMin m = new MaxMin();

        System.out.println(m.solution("-1 -2 -3 -4"));
    }
}
