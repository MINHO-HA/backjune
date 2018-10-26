package Backjune.copy;
import java.util.Scanner;

public class _180528_1546 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int N=scan.nextInt();
		
		double sum=0;
		double max=0;
		double score=0;
		
		
		for(int i=0; i<N; ++i) {
			
			score=scan.nextInt();
			
			sum=sum+score;
		if (score>max) {
			max=score;
		}
	
			
			
		}		
		double avg=0;
		
		avg=100*sum/max/N;
		
		System.out.println(avg);
	}
}
