package level1;
/*
1-1. 입력된 수가 짝수라면 2로 나눕니다.
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.

입출력 예 #1
문제의 설명과 같습니다.
입출력 예 #2
16 → 8 → 4 → 2 → 1 이 되어 총 4번 만에 1이 됩니다.
입출력 예 #3
626331은 500번을 시도해도 1이 되지 못하므로 -1을 리턴해야 합니다.
 */
public class Collatz {
    public int solution(int num) {
        int answer = 0;
        while (num != 1) {
            num = num%2==0?num/2:num % 2 == 1?num * 3 + 1:0;
            answer ++;

            if(answer > 500){
                answer = -1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Collatz c = new Collatz();
        System.out.println(c.solution(626331));
    }
}
