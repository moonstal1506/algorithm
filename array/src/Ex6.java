import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//6.������ �Ҽ�
//���� �ް� ���� �迭�� ��� �Ѱ�
//��̸���Ʈ
//�ݺ��ؼ� �ӽú����� ��� res 0����
//tmp�� 0���� Ŭ������ �������� �� �̿��� ������
//�Ҽ�����Ȯ�� ���ڳѰ� 1,����������� ������ȯ
//answer�� ���
public class Ex6 {
	
	public static boolean is�Ҽ�(int res) {
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
			if(is�Ҽ�(res)) answer.add(res);
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
