package P_T;
/*
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

입출력 예 #1
12345	[5,4,3,2,1]
 */
public class ReversedArray {
    public int[] solution(long n) {
        String input = Long.toString(n);
        int[] answer = new int[input.length()];
        for (int i = input.length() - 1; i >=0; i--) {
            answer[input.length() - i - 1] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }

        return answer;
    }
}


