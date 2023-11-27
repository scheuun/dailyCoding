package level1.A_E;

public class Comma {
    public String solution(int price) {
        String answer = Integer.toString(price);
        String result = "";

        for (int i = answer.length() - 1; i >= 0; i--) {
            result += answer.charAt(answer.length() - i - 1);
            if (i % 3 == 0 && i != 0) result += "," ;
        }

        return result;
    }

    public static void main(String[] args) {
        Comma comma = new Comma();

        System.out.println(comma.solution(1000000));
        System.out.println(comma.solution(123456789));
    }
}
