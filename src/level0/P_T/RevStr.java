package level0.P_T;
/*
문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

my_string	return
"jaron"	"noraj"
"bread"	"daerb"
 */
public class RevStr {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        return sb.reverse().toString();
    }
}
