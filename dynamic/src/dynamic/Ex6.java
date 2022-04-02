package dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//6.최대점수 구하기
public class Ex6 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();//문제수
		int m=kb.nextInt();//제한시간
		int[] dy=new int[m+1];
		for(int i=0; i<n; i++){
			int ps=kb.nextInt();//점수
			int pt=kb.nextInt();//푸는시간
			for(int j=m; j>=pt; j--){//앞문제와 다르게 중복되면 안된다 뒤에서부터 계산/ 제한시간이 푸는시간보다 많거나 같을때까지
				dy[j]=Math.max(dy[j], dy[j-pt]+ps);//최대점수 구하기 시간빼고 그때의 점수에 +ps
			}
		}
		System.out.print(dy[m]);
	}
}