import java.util.ArrayList;
import java.util.Scanner;

//13. ���Ž�� ��������Ʈ ArrayList
//���� ��� ������ �������� ��ȿ������
//���� ������ŭ ��̸���Ʈ ����� ���
public class Ex13 {
	
	static int n, m, answer=0;
	static ArrayList<ArrayList<Integer>> graph;//���� �����ϴ� ��̸���Ʈ�� ��̸���Ʈ
	static int[] ch;
	
	public void DFS(int v){
		if(v==n) answer++;//����
		else{
			for(int nv : graph.get(v)){//v�� ��̸���Ʈ�� �� ������
				if(ch[nv]==0){//�湮���߳�?
					ch[nv]=1;//üũ
					DFS(nv);
					ch[nv]=0;//üũ ���
				}
			}
		}
	}
	
	public static void main(String[] args){
		Ex13 T = new Ex13();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Integer>());//��ü����
		}
		ch=new int[n+1];
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			graph.get(a).add(b);//a��° ��̸���Ʈ�� b�־���
		}
		ch[1]=1;//üũ
		T.DFS(1);
		System.out.println(answer);
	}	
}