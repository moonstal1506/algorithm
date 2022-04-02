package dynamic;

import java.util.Scanner;


//3. �ִ�κ���������
public class Ex3 {
	static int[] dy;
	public int solution(int[] arr){
		int answer=0;
		dy=new int[arr.length];//�ִ�������� ���� �迭
		dy[0]=1;
		for(int i=1; i<arr.length; i++){
			int max=0;
			for(int j=i-1; j>=0; j--){
				if(arr[j]<arr[i] && dy[j]>max) max=dy[j];//�ڿ��Ű� ū�����̸鼭 �ִ� ���� ���� �ƽ����� ũ�� �ƽ��� ��ƶ�
			}
			dy[i]=max+1;//���� �� �������� 
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