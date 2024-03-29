package A_E;
/*
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

s	n	result
"AB"	1	"BC"
"z"	1	"a"
"a B z"	4	"e F d"
 */
public class CaesarCi {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch))
                ch = (Character.isLowerCase(ch)) ? (char) (ch + n > 122 ? ch - 26 + n : ch + n)
                    : (char) (ch + n > 90 ? ch - 26 + n : ch + n);

            answer += ch;
        }

        return answer;
    }

    public static void main(String[] args) {
        CaesarCi caesarCi = new CaesarCi();

        System.out.println(caesarCi.solution("AB", 1));
        System.out.println(caesarCi.solution("z",	1));
        System.out.println(caesarCi.solution("a B z", 4));
    }
}
