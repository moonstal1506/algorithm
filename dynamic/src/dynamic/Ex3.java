package dynamic;

import java.util.Scanner;


//3. 최대부분증가수열
public class Ex3 {
	static int[] dy;
	public int solution(int[] arr){
		int answer=0;
		dy=new int[arr.length];//최대수열개수 담을 배열
		dy[0]=1;
		for(int i=1; i<arr.length; i++){
			int max=0;
			for(int j=i-1; j>=0; j--){
				if(arr[j]<arr[i] && dy[j]>max) max=dy[j];//뒤에거가 큰숫자이면서 최대 수열 수가 맥스보다 크면 맥스에 담아라
			}
			dy[i]=max+1;//뒤의 수 수열길이 
			answer=Math.max(answer, dy[i]);
		}
		return answer;
	}

	public static void main(String[] args){
		Ex3 T = new Ex3();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(arr));
	}
}