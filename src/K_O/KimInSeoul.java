package K_O;
/*
String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아,
"김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

입출력 예#1
["Jane", "Kim"]	"김서방은 1에 있다"
 */
public class KimInSeoul {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i<seoul.length; i++) {
            if (seoul[i].equals("Kim")) answer = "김서방은 " + i + "에 있다";
        }
        return answer;
    }

    public static void main(String[] args) {
        KimInSeoul k = new KimInSeoul();
        System.out.println(k.solution(new String[]{"Jane", "Kim"}));
    }
}
