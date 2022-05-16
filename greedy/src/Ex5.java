
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

//5. 다익스트라 알고리즘
//비용 오름차순
class Edge implements Comparable<Edge>{
    public int vex;
	public int cost;
    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge ob){
        return this.cost-ob.cost;
    }
}

public class Ex5 {
	static int n, m;
	static ArrayList<ArrayList<Edge>> graph;
	static int[] dis;

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		graph = new ArrayList<ArrayList<Edge>>();
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Edge>());
		}
		dis=new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			graph.get(a).add(new Edge(b, c));
		}
		
		//q에 엣지 넣음, dis[1]=0 q뽑는거 반복 정점 비용 
		//뽑은 현재 비용이 지금 dis비용보다 크면 패스
		//정점에 달린 엣지 돌려 *다음vex의 dis! 현재비용+다음 비용 더 작으면 다음 엣지 추가
		PriorityQueue<Edge> q = new PriorityQueue<>();
		q.add(new Edge(1,0));
		dis[1]=0;
		while(!q.isEmpty()) {
			Edge edge = q.poll();
			int nowCost=edge.cost;
			int nowVex=edge.vex;
			if(nowCost>dis[nowVex]) {
				continue;
			}
			for(Edge e: graph.get(nowVex)) {
				if(dis[e.vex]>nowCost+e.cost) {
					dis[e.vex]=nowCost+e.cost;
					q.add(new Edge(e.vex,nowCost+e.cost));
				}
			}
		}
		
		for(int i=2; i<=n; i++){
			if(dis[i]!=Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
			else System.out.println(i+" : impossible");
		}
	}
}

