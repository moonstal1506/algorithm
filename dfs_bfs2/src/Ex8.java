
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Ex8 {
		static int[] b, p, ch;//�޺���̼� ��, ���� ,üũ
		static int n, f;//���� , ��
		boolean flag=false;
		int[][] dy=new int[35][35];
		public int combi(int n, int r){
			if(dy[n][r]>0) return dy[n][r];//�̹� ����
			if(n==r || r==0) return 1;
			else return dy[n][r]=combi(n-1, r-1)+combi(n-1, r);
		}

		public void DFS(int L, int sum){
			if(flag) return;//���ÿ� �׿��ִ� �͵� �� ���Ͻ���
			if(L==n){
				if(sum==f){
					for(int x : p) System.out.print(x+" ");//�����迭 ���
					flag=true;
				}
			}
			else{
				for(int i=1; i<=n; i++){//���� ����� �Ŵϱ� 1������
					if(ch[i]==0){
						ch[i]=1;//i��� ���ڸ� ����ߴ�
						p[L]=i;
						DFS(L+1, sum+(p[L]*b[L]));//����*���հ�
						ch[i]=0;
					}
				}
			}
		}

		public static void main(String[] args){
			Ex8 T = new Ex8();
			Scanner kb = new Scanner(System.in);
			n=kb.nextInt();
			f=kb.nextInt();
			b=new int[n];
			p=new int[n];
			ch=new int[n+1];//1����
			for(int i=0; i<n; i++){
				b[i]=T.combi(n-1, i);//���� ����ؼ� �迭�� �־�
			}
			T.DFS(0, 0);
		}
	}