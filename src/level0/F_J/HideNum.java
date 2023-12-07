package level0.F_J;
/*
문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

my_string	result
"aAb1B2cC34oOp"	10
"1a2b3c4d123"	16
 */
public class HideNum {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", "");

        for (int i = 0; i < my_string.length(); i++) {
            answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
        }

        return answer;
    }
}
