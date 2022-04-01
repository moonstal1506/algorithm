
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

//5.다익스트라 알고리즘
public class Ex5 {
	static int n, m;
	static ArrayList<ArrayList<Edge>> graph;
	static int[] dis;
	public void solution(int v){
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(new Edge(v, 0));//1번 정점 가는데 가중치 0
		dis[v]=0;//그래서 0
		while(!pQ.isEmpty()){
			Edge tmp=pQ.poll();//가중치 작은것 부터 나올거임
			int now=tmp.vex;//1
			int nowCost=tmp.cost;//0
			if(nowCost>dis[now]) continue;//0>0 /(2,11)(2,12)가 있을 때 이미 11했는데 12할 필요 없다.
			for(Edge ob : graph.get(now)){//1이 갈수있는 정점과 가중치(2,12)(3,4)
				if(dis[ob.vex]>nowCost+ob.cost){//dis[2]는 무한>0+12 처음은 무한이니까 무조건 담김
					dis[ob.vex]=nowCost+ob.cost;//덮어쓰기
					pQ.offer(new Edge(ob.vex, nowCost+ob.cost));//그리고 pq에 정점과 최소비용이라고 생각한 값 넣어줌
				}
			}
		}
	}

	public static void main(String[] args){
		Ex5 T = new Ex5();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();//정점수
		m=kb.nextInt();//간선수
		graph = new ArrayList<ArrayList<Edge>>();
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Edge>());
		}
		dis=new int[n+1];//정점 1부터시작
		Arrays.fill(dis, Integer.MAX_VALUE);//가장 큰값으로 초기화
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			graph.get(a).add(new Edge(b, c));//a가 갈수 있는 방향과 가중치
		}
		T.solution(1);//1번 정점
		for(int i=2; i<=n; i++){
			if(dis[i]!=Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
			else System.out.println(i+" : impossible");
		}
	}
}

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