
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
[입력데이타]
6 11
0 1 4
0 2 2 
0 5 25
1 3 8
1 4 7
2 1 1
2 4 4
3 5 6
4 0 3
4 3 5
4 5 12
VELEQD
 *
 */
public class Dijkstra_PQ2 {
	
	static class Edge implements Comparable<Edge>{

		int v;
		int w;

		public Edge(int v, int w) {
			super();
			this.v = v;
			this.w = w;
		}

		@Override
		public String toString() {
			return w+"";
		}

		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return this.w-o.w;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V= sc.nextInt();
		int E= sc.nextInt();
		
		List<Edge>[] adj = new ArrayList[V];
		for(int i=0;i<V;i++) {
			adj[i]=new ArrayList<>();
		}
		for(int i=0;i<E;i++) {
			adj[sc.nextInt()].add(new Edge(sc.nextInt(), sc.nextInt()));
		}
		
		Queue<Edge> pq = new PriorityQueue<>();
		Edge[] D = new Edge[V];
		for(int i=0;i<V;i++) {
			if(i==0) {
				D[i]=new Edge(i,0);
			}else {
				D[i]=new Edge(i,Integer.MAX_VALUE);
			}
			pq.add(D[i]);
		}
		
		while(!pq.isEmpty()) {
			Edge now = pq.poll();
			for(Edge next: adj[now.v]) {
				if(D[next.v].w>D[now.v].w+next.w) {
					D[next.v].w=D[now.v].w+next.w;
					pq.remove(D[next.v]);
					pq.add(D[next.v]);
				}
			}
		}
		System.out.println(Arrays.toString(D));
	}
}


