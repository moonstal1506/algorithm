
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Ex8 {
		static int[] b, p, ch;//콤비네이션 값, 순열 ,체크
		static int n, f;//숫자 , 합
		boolean flag=false;
		int[][] dy=new int[35][35];
		public int combi(int n, int r){
			if(dy[n][r]>0) return dy[n][r];//이미 구함
			if(n==r || r==0) return 1;
			else return dy[n][r]=combi(n-1, r-1)+combi(n-1, r);
		}

		public void DFS(int L, int sum){
			if(flag) return;//스택에 쌓여있는 것들 다 리턴시켜
			if(L==n){
				if(sum==f){
					for(int x : p) System.out.print(x+" ");//순열배열 출력
					flag=true;
				}
			}
			else{
				for(int i=1; i<=n; i++){//숫자 사용할 거니까 1부터임
					if(ch[i]==0){
						ch[i]=1;//i라는 숫자를 사용했다
						p[L]=i;
						DFS(L+1, sum+(p[L]*b[L]));//순열*조합값
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
			ch=new int[n+1];//1부터
			for(int i=0; i<n; i++){
				b[i]=T.combi(n-1, i);//조합 계산해서 배열에 넣어
			}
			T.DFS(0, 0);
		}
	}