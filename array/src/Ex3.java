
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//3. 가위바위보
//개수받아 a,b배열생성
//배열에 담아
//개수 배열 넘겨
//answer
//반복문으로 비교 a가 이길경우외에는 b
public class Ex3 {
	private static String solution(int n, int[] a,int[] b) {
		String answer="";
		for(int i=0;i<n;i++) {
			if(a[i]==b[i]) answer+="D";
			else if(a[i]==1&&b[i]==3) answer+="A";
			else if(a[i]==2&&b[i]==1) answer+="A";
			else if(a[i]==3&&b[i]==2) answer+="A";
			else answer+="B";
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a= new int[n];
		int[] b= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=kb.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=kb.nextInt();
		}
		for(char x:solution(n,a,b).toCharArray() )
			System.out.println(x);
		
	}

}