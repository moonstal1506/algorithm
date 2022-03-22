import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//6.뒤집은 소수
//개수 받고 숫자 배열에 담아 넘겨
//어레이리스트
//반복해서 임시변수에 담아 res 0선언
//tmp가 0보다 클때까지 나머지와 몫 이용해 뒤집어
//소수인지확인 숫자넘겨 1,나누어떨어지면 거짓반환
//answer에 담기
public class Ex6 {
	
	public static boolean is소수(int res) {
		if(res==1)return false;
		for(int i=2;i<res;i++) {
			if(res%i==0) return false;
		}
		return true;
	}
	
	public static ArrayList<Integer> solution(int n,int[] arr) {
		ArrayList<Integer> answer =new ArrayList<>();
		for(int i=0;i<n;i++) {
			int tmp= arr[i];
			int res= 0;
			while(tmp>0) {
				int t=tmp%10;
				res=res*10+t;
				tmp=tmp/10;
			}
			if(is소수(res)) answer.add(res);
		}
		
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		for(int x:solution(n,arr) )
		System.out.print(x+" ");
		
	}

}
