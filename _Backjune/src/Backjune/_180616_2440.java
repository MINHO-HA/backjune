package Backjune;

import java.util.Scanner;

public class _180616_2440 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		for(int i=1; i<=N; i++) {
			System.out.print("*");
			for(int j=1; j<=N-i; j++) {
				System.out.print("*");
			} System.out.println();
		}

	}

}
