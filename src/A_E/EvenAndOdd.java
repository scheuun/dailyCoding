package A_E;

public class EvenAndOdd {
    public String solution(int num) {
        String answer = (num % 2 == 0)?"Even":"Odd";
        return answer;
    }
}

/*
정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

입출력 예 #1
3	"Odd"
입출력 예 #1
4	"Even"
 */