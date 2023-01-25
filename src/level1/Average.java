package level1;

public class Average {
    public double solution(int[] arr) {
        double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        answer = answer / arr.length;

        return answer;
    }

    public static void main(String[] args) {
        Average a = new Average();
        System.out.println(a.solution(new int[]{1, 2, 3, 4}));
    }
}

/*
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

입출력 예 #1
[1,2,3,4]	2.5
입출력 예 #2
[5,5]	5
 */