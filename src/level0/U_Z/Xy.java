package level0.U_Z;
/*
사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를 매깁니다.

dot	result
[2, 4]	1
[-7, 9]	2
 */
public class Xy {
    public int solution(int[] dot) {
        return dot[0] * dot[1] > 0 ? dot[0] > 0 ? 1 : 3 : dot[0] > 0 ? 4 : 2;
    }
}
