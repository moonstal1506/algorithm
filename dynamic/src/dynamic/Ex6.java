package dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//6.�ִ����� ���ϱ�
public class Ex6 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();//������
		int m=kb.nextInt();//���ѽð�
		int[] dy=new int[m+1];
		for(int i=0; i<n; i++){
			int ps=kb.nextInt();//����
			int pt=kb.nextInt();//Ǫ�½ð�
			for(int j=m; j>=pt; j--){//�չ����� �ٸ��� �ߺ��Ǹ� �ȵȴ� �ڿ������� ���/ ���ѽð��� Ǫ�½ð����� ���ų� ����������
				dy[j]=Math.max(dy[j], dy[j-pt]+ps);//�ִ����� ���ϱ� �ð����� �׶��� ������ +ps
			}
		}
		System.out.print(dy[m]);
	}
}