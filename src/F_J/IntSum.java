package F_J;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요

num_str	result
"123456789"	45
"1000000"	1
 */
public class IntSum {
    public int solution(String num_str) {
        int answer = 0;

        for (int i = 0; i < num_str.length(); i++) {
            answer += Character.getNumericValue(num_str.charAt(i));
        }

        return answer;
    }
}
