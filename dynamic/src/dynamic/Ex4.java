package dynamic;

import java.util.Arrays;
import java.util.Scanner;


//5.동전교환 냅색  
public class Ex4 {
	static int n, m;//동전개수 ,거스름돈
	static int[] dy;
	public int solution(int[] coin){
		Arrays.fill(dy, Integer.MAX_VALUE);//최소 개수 구할 거니까 최대값으로 초기화
		dy[0]=0;
		for(int i=0; i<n; i++){
			for(int j=coin[i]; j<=m; j++){//동전 값으로 돌아 1로 몇개 필요 세팅하고 3들어갈 수 있는지 5들어갈 수 있는지
				dy[j]=Math.min(dy[j], dy[j-coin[i]]+1);//기존값보다 작으면 바꿔줄건데 거스름돈을 동전으로 뺀 숫자의 동전개수에+1
			}
		}
		return dy[m];//필요한 거스름돈의 최소 동전개수
	}

	public static void main(String[] args){
		Ex4 T = new Ex4();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){//동전 종류 담기
			arr[i]=kb.nextInt();
		}
		m=kb.nextInt();
		dy=new int[m+1];
		System.out.print(T.solution(arr));
	}
}