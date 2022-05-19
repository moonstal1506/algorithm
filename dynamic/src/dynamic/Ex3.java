package dynamic;

import java.util.Scanner;


//3. 최대부분증가수열(LIS)
public class Ex3 {

	public static void main(String[] args){
		Ex3 T = new Ex3();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		int answer=0;
		int[] dy=new int[arr.length];
		dy[0]=1;
		//뒤에 숫자가 더 크면서 맥스보다 크면 1더해서 넣어줌
		for(int i=1; i<arr.length; i++){
			int max=0;
			for(int j=i-1; j>=0; j--){
				if(arr[j]<arr[i] && dy[j]>max) max=dy[j];
			}
			dy[i]=max+1;
			answer=Math.max(answer, dy[i]);
		}
		System.out.print(answer);
	}
}