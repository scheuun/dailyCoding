package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input;

        List<Integer> numList = new ArrayList<>();

        do {
            input = sc.nextInt();
            numList.add(input);
        } while (sc.hasNextInt());


        for (int i=0; i<numList.size()-1; i++) {
            for (int j=0; j<numList.size()-1-i; j++)
                if (numList.get(j) > numList.get(j+1)) {
                    int tmp = numList.get(j);
                    numList.set(j, numList.get(j+1));
                    numList.set(j+1, tmp);
                }
            System.out.print(numList);
        }
    }
}