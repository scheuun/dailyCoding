package level1.A_E;
/*
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
s	return
"abcde"	"c"
"qwer"	"we"
 */
public class CenterS {
    public String solution(String s) {
        return s.length() % 2 == 1
                ?s.substring(s.length()/2, s.length()/2+1)
                :s.substring(s.length()/2-1, s.length()/2+1);
    }

    public static void main(String[] args) {
        CenterS centerS = new CenterS();

        System.out.println(centerS.solution("abcde"));
        System.out.println(centerS.solution("qwer"));
    }
}
