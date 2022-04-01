
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

//8.원더랜드 프림

public class Ex8 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();//정점 수 
		int m=kb.nextInt();//짝의 수
		ArrayList<ArrayList<Edge3>> graph = new ArrayList<ArrayList<Edge3>>();
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Edge3>());
		}
		int[] ch=new int[n+1];
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			graph.get(a).add(new Edge3(b, c));
			graph.get(b).add(new Edge3(a, c));//무방향이라 b에서a로 가는 것도
		}
		int answer=0;
		PriorityQueue<Edge3> pQ = new PriorityQueue<>();
		pQ.offer(new Edge3(1, 0));//1번정점 부터 시작
		while(!pQ.isEmpty()){
			Edge3 tmp=pQ.poll();
			int ev=tmp.vex;//도착 정점
			if(ch[ev]==0){//회로 되는 것 방지 체크
				ch[ev]=1;//체크
				answer+=tmp.cost;//간선 비용
				for(Edge3 ob : graph.get(ev)){//도착정점에서 뻗기 ev를 뒤져
					if(ch[ob.vex]==0) pQ.offer(new Edge3(ob.vex, ob.cost));//넣은거 또넣지 말자는걸 체크 방금 지나온곳
				}
			}
		}
		System.out.println(answer);
	}
}

class Edge3 implements Comparable<Edge3>{
    public int vex;
	public int cost;
    Edge3(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge3 ob){
        return this.cost-ob.cost;//최소값 우선순위
    }
}