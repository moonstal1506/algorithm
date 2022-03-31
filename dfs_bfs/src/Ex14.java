import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//14. 그래프 최단거리bfs
public class Ex14 {

		static int n, m=0;
		static ArrayList<ArrayList<Integer>> graph;
		static int[] ch, dis;
		public void BFS(int v){
			ch[v]=1;//출발지 체크
			dis[v]=0;//v까지 가는 최소 거리
			Queue<Integer> queue=new LinkedList<>();
			queue.offer(v);
			while(!queue.isEmpty()){
				int cv=queue.poll();
				for(int nv : graph.get(cv)){
					if(ch[nv]==0){
						ch[nv]=1;
						queue.offer(nv);
						dis[nv]=dis[cv]+1;//현재까지거리+1=다음거리
					}
				}
			}
		}
		
		public static void main(String[] args){
			Ex14 T = new Ex14();
			Scanner kb = new Scanner(System.in);
			n=kb.nextInt();//정점
			m=kb.nextInt();//간선
			graph=new ArrayList<ArrayList<Integer>>();
			for(int i=0; i<=n; i++){
				graph.add(new ArrayList<Integer>());
			}//인접리스트
			ch=new int[n+1];
			dis=new int[n+1];
			for(int i=0; i<m; i++){
				int a=kb.nextInt();
				int b=kb.nextInt();
				graph.get(a).add(b);
			}
			T.BFS(1);
			for(int i=2; i<=n; i++){
				System.out.println(i+" : "+dis[i]);
			}
		}	
	}