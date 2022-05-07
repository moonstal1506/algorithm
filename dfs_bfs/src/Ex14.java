import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//14. 그래프 최단거리(BFS)
public class Ex14 {

		static int n, m=0;
		static ArrayList<ArrayList<Integer>> graph;
		static int[] ch, dis;
		public void BFS(int v){
			ch[v]=1;
			dis[v]=0;
			Queue<Integer> q = new LinkedList<>();
			q.add(v);
			while(!q.isEmpty()) {
				int cv= q.poll();
				for(int nv : graph.get(cv)) {
					if(ch[nv]==0) {
						//체크
						ch[nv]=1;
						//넣기
						q.add(nv);
						//거리
						dis[nv]=dis[cv]+1;
					}
				}
			}
		}
		
		public static void main(String[] args){
			Ex14 T = new Ex14();
			Scanner kb = new Scanner(System.in);
			n=kb.nextInt();
			m=kb.nextInt();
			graph=new ArrayList<ArrayList<Integer>>();
			for(int i=0; i<=n; i++){
				graph.add(new ArrayList<Integer>());
			}
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