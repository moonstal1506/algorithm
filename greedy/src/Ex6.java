
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

//6.ģ���ΰ�
public class Ex6 {
	static int[] unf;
	public static int Find(int v){//v�л��� ���չ�ȣ�� �������ش� 1�� ȣ���ϸ� 2�� ȣ���ϰ� 2�� 3�� ȣ�� �� ���� ��ȣ ���Ϲ���(ģ���� ���)
		if(v==unf[v]) return v;//�ε��� ��ȣ�� �迭��
		else return unf[v]=Find(unf[v]);//��� ����
	}
	public static void Union(int a, int b){
		int fa=Find(a);//1
		int fb=Find(b);//2
		if(fa!=fb) unf[fa]=fb;//1!=2 ���� ������ ���� ���� unf[1]=2 ���� ������ �� ��Ÿ��
	}
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();//�л���
		int m=kb.nextInt();//���ڽ�
		unf=new int[n+1];//���� �������� ��Ÿ�� �迭
		for(int i=1; i<=n; i++) unf[i]=i;//�л� �־���
		for(int i=1; i<=m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			Union(a, b);
		}
		int a=kb.nextInt();
		int b=kb.nextInt();
		int fa=Find(a);
		int fb=Find(b);
		if(fa==fb) System.out.println("YES");
		else System.out.println("NO");		
	}
}