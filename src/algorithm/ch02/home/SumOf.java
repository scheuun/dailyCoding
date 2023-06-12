package algorithm.ch02.home;

import java.util.Scanner;

class SumOf {

	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수는  : ");
		int num = stdIn.nextInt();

		int[] a = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		System.out.println("모든 요소의 합계는 " + sumOf(a) + "입니다.");
	}
}
