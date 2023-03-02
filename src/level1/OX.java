package level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        sc.nextLine();

        List<String> oxList = new ArrayList<>();

        for (int i=0; i<row; i++) {
            int num = 0;
            int score = 0;
            String in = sc.nextLine();
            oxList.add(i, in);
            for (int j=0; j<in.length(); j++) {
                char ox = oxList.get(i).charAt(j);
                if (ox == 'O') {
                    num++;
                    score += num;
                }else{
                    num=0;
                }
            }
            System.out.println(score);
        }
    }
}
