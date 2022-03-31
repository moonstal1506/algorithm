import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//12. ���Ž��
public class Ex12 {
	static int n, m, answer=0;
	static int[][] graph;
	static int[] ch;
	
	public void DFS(int v){//����
		if(v==n) answer++;//���� ������ ������ �Դ°�?
		else{
			for(int i=1; i<=n; i++){
				if(graph[v][i]==1 && ch[i]==0){//���� �־���ϰ�&&�湮������ �ȵ�
					ch[i]=1;//�湮üũ
					DFS(i);//i�� �̵� i��v�� �ٽ� ȣ��
					ch[i]=0;//back�ϴ� ���� �ٽ� üũ ���
				}
			}
		}
	}
	
	public static void main(String[] args){
		Ex12 T = new Ex12();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();//��������
		m=kb.nextInt();//��������
		graph=new int[n+1][n+1];//1������ ����
		ch=new int[n+1];//üũ
		for(int i=0; i<m; i++){//����
			int a=kb.nextInt();
			int b=kb.nextInt();
			graph[a][b]=1;//���� ���� üũ
		}
		ch[1]=1;//����� üũ
		T.DFS(1);//1�� �ѱ�
		System.out.println(answer);
	}	
}