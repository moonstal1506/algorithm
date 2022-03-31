import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//12. 경로탐색
public class Ex12 {
	static int n, m, answer=0;
	static int[][] graph;
	static int[] ch;
	
	public void DFS(int v){//현재
		if(v==n) answer++;//현재 지점이 끝까지 왔는가?
		else{
			for(int i=1; i<=n; i++){
				if(graph[v][i]==1 && ch[i]==0){//갈수 있어야하고&&방문했으면 안됨
					ch[i]=1;//방문체크
					DFS(i);//i로 이동 i가v로 다시 호출
					ch[i]=0;//back하는 시점 다시 체크 취소
				}
			}
		}
	}
	
	public static void main(String[] args){
		Ex12 T = new Ex12();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();//정점개수
		m=kb.nextInt();//간선개수
		graph=new int[n+1][n+1];//1번부터 시작
		ch=new int[n+1];//체크
		for(int i=0; i<m; i++){//현재
			int a=kb.nextInt();
			int b=kb.nextInt();
			graph[a][b]=1;//가능 방향 체크
		}
		ch[1]=1;//출발점 체크
		T.DFS(1);//1번 넘김
		System.out.println(answer);
	}	
}