package Backjune.copy;

import java.util.Scanner;

public class _180616_Memo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N=sc.nextInt();
		
		
		//1. 별 1.2.3.4. 순서대로 찍기 문제 (백준문제 2438번)
		/*for(int i=0; i<N; i++) {
			System.out.print("*");
			for(int j=0; j<i ; j++) {
				System.out.print("*");
			} System.out.println();
		}*/
		
		
		
		//2. 별 오른쪽 정렬로 찍기 문제 (백준문제 2439번)
		/*for(int i=1; i<=N; i++) {
			for(int j=1; j<=N-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}*/
		
		
		
		//3. 별 5.4.3.2... 점점 줄어드는거 찍기 (백준문제 2440번)
		/*for(int i=1; i<=N; i++) {
			System.out.print("*");
			for(int j=1; j<=N-i; j++) {
				System.out.print("*");
			} System.out.println();
		}*/
		
		
		
		//4. 별 5.4.3.2... 점점 줄어드는거 오른쪽정렬로 찍기 (백준문제 2441번)
		/*for(int i=1; i<=N; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=N-i; j++) {
				System.out.print("*");
			} System.out.println();
		}*/
		
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			} 
			for(int j=0; j<=N-i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
