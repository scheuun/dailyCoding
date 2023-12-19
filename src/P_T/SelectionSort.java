package P_T;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input;
        boolean b;
        int num;

        List<Integer> numList = new ArrayList<>();

        do {
            input = sc.nextInt();
            numList.add(input);
        } while (sc.hasNextInt());


//        do {
//            b=false;
//            input = sc.next();
//            for (int i=0; i<input.length(); i++) {
//                char a = input.charAt(i);
//                int asc = (int)a;
//                if (asc<48 || asc>57) {
//                    b=true;
//                }
//            }
//            if (b=false) {
//                num=Integer.parseInt(input);
//            }
//        } while (b==true);

        for (int i=0; i<numList.size()-1; i++) {
            for (int j=i+1; j<numList.size(); j++)
                if (numList.get(i) > numList.get(j)) {
                    int tmp = numList.get(i);
                    numList.set(i, numList.get(j));
                    numList.set(j, tmp);
                }
            System.out.println(numList);
        }
    }
}