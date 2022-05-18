
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

//원더랜드(프림 : PriorityQueue)

//정점 비용, 비용오름차순
class Edge3 implements Comparable<Edge3>{
    public int vex;
	public int cost;
    Edge3(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge3 ob){
        return this.cost-ob.cost;
    }
}

public class Ex8 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		ArrayList<ArrayList<Edge3>> graph = new ArrayList<ArrayList<Edge3>>();
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Edge3>());
		}
		
		//체크배열, 무방향 그래프
		int[] ch=new int[n+1];
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			graph.get(a).add(new Edge3(b, c));
			graph.get(b).add(new Edge3(a, c));
		}
		
		//pq에 엣지 정점1부터 비용0
		//비어있지 않을 때까지
		//정점 체크0일때 체크하고 비용합하고 그다음 엣지의 정점체크 0이면 pq에 넣어줌
		PriorityQueue<Edge3> pQ = new PriorityQueue<>();
		pQ.offer(new Edge3(1, 0));
		int answer=0;
		while(!pQ.isEmpty()){
			Edge3 tmp=pQ.poll();
			int ev=tmp.vex;
			if(ch[ev]==0){
				ch[ev]=1;
				answer+=tmp.cost;
				for(Edge3 ob : graph.get(ev)){
					if(ch[ob.vex]==0) pQ.offer(new Edge3(ob.vex, ob.cost));
				}
			}
		}
		System.out.println(answer);
	}
}

