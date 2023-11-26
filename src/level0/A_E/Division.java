package level0.A_E;
/*
정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.

num1	num2	result
3	2	1500
7	3	2333
1	16	62
 */
public class Division {
    public int solution(int num1, int num2) {
        return 1000 * num1 / num2;
    }
}
