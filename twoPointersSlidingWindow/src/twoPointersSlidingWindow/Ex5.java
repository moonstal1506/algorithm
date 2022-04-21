package twoPointersSlidingWindow;

import java.util.Scanner;

//5.연속된 자연수의 합 O
public class Ex5 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int answer=0;
		int cnt=1;
		n--;
		while(n>0) {
			cnt++;
			n=n-cnt;
			if(n%cnt==0) {
				answer++;
			}
		}
			
		System.out.println(answer);
	}

}