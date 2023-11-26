package level0.P_T;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int user = sc.nextInt();
        List<Integer> scoreList = new ArrayList<>();
        System.out.println("학생 " + user + "명 입력했습니다.");

        for (int i=0; i<user; i++) {
            System.out.println("국어: ");
            int language = sc.nextInt();
            System.out.println("수학: ");
            int math = sc.nextInt();
            System.out.println("사회: ");
            int society = sc.nextInt();
            System.out.println("과학: ");
            int science = sc.nextInt();
            int average = (language + math + society + science)/ 4;
            System.out.printf("평균: " + average + "점\n");
            scoreList.add(i, average);
        }

        for (int i=0; i<scoreList.size()-1; i++) {
            for (int j=0; j<scoreList.size()-1-i; j++) {
                if (scoreList.get(j) < scoreList.get(j+1)) {
                    int tmp = scoreList.get(j);
                    scoreList.set(j, scoreList.get(j+1));
                    scoreList.set(j+1, tmp);
                }
            }
            System.out.println(scoreList);
        }
    }
}
