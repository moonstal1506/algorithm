import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//11. 임시반장 정하기
public class Ex11 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
				arr[i][j]=kb.nextInt();
			}
		}
		
		int max=0;
		int student=0;
		for(int i=1;i<=n;i++) {
			int cnt=0;
			for(int j=1;j<=n;j++) {
				for(int k=1;k<=5;k++) {
					if(arr[i][k]==arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt>max) {
				max=cnt;
				student=i;
			}
		}
		System.out.println(student);
	}

}
