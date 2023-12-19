package A_E;
/*
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수,
그다음 최소공배수를 넣어 반환하면 됩니다.
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

n	m	return
3	12	[3, 12]
2	5	[1, 10]
 */
public class DivMul {
    public int[] solution(int n, int m) {
        int d = 0;

        for(int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) d = i;
        }

        return new  int[]{d, n * m / d};
    }

    public static void main(String[] args) {
        DivMul divMul = new DivMul();

        for (int i = 0; i < 1; i++) {
            int[] result1 = divMul.solution(3, 12);
            System.out.println("[" + result1[0] + ", " + result1[1] + "]");
            int[] result2 = divMul.solution(4, 14);
            System.out.println("[" + result2[0] + ", " + result2[1] + "]");
            int[] result3 = divMul.solution(2, 5);
            System.out.println("[" + result3[0] + ", " + result3[1] + "]");
        }
    }
}
