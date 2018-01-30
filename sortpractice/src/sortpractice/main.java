package sortpractice;

import java.util.Arrays;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
				a[i]=num;
			
		}
		Arrays.sort(a);
		System.out.println(a[K-1]);
	}

}
