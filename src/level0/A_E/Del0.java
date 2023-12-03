package level0.A_E;
/*
정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.

n_str	result
"0010"	"10"
"854020"	"854020"
 */
public class Del0 {
    public String solution(String n_str) {
        String answer = "";

        for (int i = 0; i < n_str.length(); i++) {
            answer += n_str.charAt(i) != '0' ? n_str.charAt(i) :
                     answer.length() > 0 ? '0' : "";
        }

        return answer;
    }
}
