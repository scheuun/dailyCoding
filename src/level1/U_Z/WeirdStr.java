package level1.U_Z;
/*
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

s	return
"try hello world"	"TrY HeLlO WoRlD"
 */
public class WeirdStr {
    public String solution(String s) {
        String[] arr = s.split("");
        String answer = "";
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) {
                answer += arr[i];
                idx = 0;
            } else if (idx % 2 == 0) {
                answer += arr[i].toUpperCase();
                idx++;
            } else if (idx % 2 != 0) {
                answer += arr[i].toLowerCase();
                idx++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        WeirdStr weirdStr = new WeirdStr();
        System.out.println(weirdStr.solution("try hello world"));
    }
}
