
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//4.�Ǻ���ġ ����
//�����Է� �Ѱ�
//answer �迭
//0,1�� 1�̴�
//�ݺ��� i-2��i-1 ���Ѱ� i
//public class Ex4 {
//	public static int[] solution(int n) {
//		int[] answer= new int[n];
//		answer[0]=1;
//		answer[1]=1;
//		for(int i=2; i<n; i++) {
//			answer[i]=answer[i-2]+answer[i-1];
//		}
//		return answer;
//	}
// 
//	public static void main(String[] args) {
//		Scanner kb = new Scanner(System.in);
//		int n = kb.nextInt();
//	
//		for(int x:solution(n) )
//			System.out.print(x+" ");
//		
//	}
//
//}


//�ٷ���� a1b2c���� ab�������
//c����� a��b�� b��c��
public class Ex4 {
	public static void solution(int n) {
		int a=1, b=1, c;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<n; i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		solution(n);
		
	}

}