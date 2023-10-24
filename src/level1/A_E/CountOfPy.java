package level1.A_E;
/*
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

입출력 예 #1
'p'의 개수 2개, 'y'의 개수 2개로 같으므로 true를 return 합니다.
입출력 예 #2
'p'의 개수 1개, 'y'의 개수 2개로 다르므로 false를 return 합니다.
 */
public class CountOfPy {
    boolean solution(String s) {
        int cnt = 0;
        char c;
        for (int i = 0; i <s.length(); i++) {
            c = s.charAt(i);
           if(c =='p' || c =='P') {
               cnt++;
           } else if (c =='y' || c =='Y') {
               cnt--;
           }
        };
        return cnt == 0?true:false;
    }

    public static void main(String[] args) {
        CountOfPy c = new CountOfPy();
        System.out.println(c.solution("pPoooyY"));
    }
}
