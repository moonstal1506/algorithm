package dynamic;

import java.util.Scanner;


//2.���ٸ� �չ����� ������ ���ٸ��� �� �ǳʴ°� �ѹ� �� ������
//������ȹ�� ������ ���� �۰� ����� Ȯ��� ������ ��
public class Ex2 {
	static int[] dy;
	public int solution(int n){
		dy[1]=1;
		dy[2]=2;
		for(int i=3; i<=n+1; i++) dy[i]=dy[i-2]+dy[i-1];
		return dy[n+1];
	}

	public static void main(String[] args){
		Ex2 T = new Ex2();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		dy=new int[n+2];
		System.out.print(T.solution(n));
	}
}