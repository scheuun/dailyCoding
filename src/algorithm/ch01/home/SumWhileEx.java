package algorithm.ch01.home;

import java.util.Scanner;

class SumWhileEx {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1에서 n까지의 총합을 구합니다.");
 		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();

		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1에서 " + n + "까지의 총합은 " + sum + "입니다.");
		System.out.println("i의 값은 " + i + "(으)로 됩니다.");
	}
}
