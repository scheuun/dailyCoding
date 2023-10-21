package level1;
/*
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

n	result
45	7
125	229
 */
public class RevBase3 {
    public int solution(int n) {
        return Integer.parseInt(new StringBuffer(Integer.toString(n,3)).reverse().toString(), 3);
    }

    public static void main(String[] args) {
        RevBase3 revBase3 = new RevBase3();

        System.out.println(revBase3.solution(45));
        System.out.println(revBase3.solution(125));
    }
}
