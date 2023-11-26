package level0.K_O;

public class OnlyNum {
    public static void main(String[] args) {
        String str = "aaa1234, ^&*2233pp";
        String[] numStr = str.split("[^0-9]+");

        int sum = 0;
        int count = 0;

        for (String s : numStr) {
            if (!s.isEmpty()) {
                int num =Integer.parseInt(s);
                sum += num;
                count++;
            }
        }

        double avg = count > 0 ? (double) sum / count : 0.0;

        System.out.println("합: " + sum);
        System.out.println("평균: " + avg);
    }
}
