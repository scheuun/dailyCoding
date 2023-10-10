package level1;

import java.util.Stack;

/*
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수,
 solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

 n	return
3	"수박수"
4	"수박수박"
 */
public class WaterMelon {
    public String solution(int n) {
        String answer = "수";

        for (int i=1; i<n; i++) {
            answer += i%2==0?"수":"박";
        }

        return answer;
    }

    public static void main(String[] args) {
        WaterMelon waterMelon = new WaterMelon();

        System.out.println(waterMelon.solution(3));
        System.out.println(waterMelon.solution(4));
    }

}
