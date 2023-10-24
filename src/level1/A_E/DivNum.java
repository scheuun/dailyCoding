package level1.A_E;
/*
    두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
    약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

    left    right	result
    13	17	43
    24	27	52
 */
public class DivNum {
    public int solution(int left, int right) {
        int sum = 0;

        for(int i=left; i<=right; i++) {
            int count = 0;
            for (int j=1; j<=i; j++)
                count += i % j == 0 ? 1 : 0;

            sum += count % 2 == 0 ? i : -i;
        }

        return sum;
    }

    public static void main(String[] args) {
        DivNum divNum = new DivNum();

        System.out.println(divNum.solution(13, 17));
        System.out.println(divNum.solution(24, 27));
    }
}
