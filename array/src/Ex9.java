import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//9. 격자판 최대합
public class Ex9 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr= new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=kb.nextInt();
			}
		}
		
		int sum1,sum2;
		int answer=0;
		for(int i=0;i<n;i++) {
			 sum1=sum2=0;
			for(int j=0;j<n;j++) {
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			answer=Integer.max(answer, sum1);
			answer=Integer.max(answer, sum2);
		}
		
		sum1=sum2=0;
		for(int i=0;i<n;i++) {
				sum1+=arr[i][i];
				sum2+=arr[i][n-1-i];
		}
		answer=Integer.max(answer, sum1);
		answer=Integer.max(answer, sum2);
		
		System.out.println(answer);
	}

}
