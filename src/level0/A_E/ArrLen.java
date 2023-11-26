package level0.A_E;

import java.util.Arrays;

public class ArrLen {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
