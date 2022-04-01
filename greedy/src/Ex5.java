
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

//5.���ͽ�Ʈ�� �˰���
public class Ex5 {
	static int n, m;
	static ArrayList<ArrayList<Edge>> graph;
	static int[] dis;
	public void solution(int v){
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(new Edge(v, 0));//1�� ���� ���µ� ����ġ 0
		dis[v]=0;//�׷��� 0
		while(!pQ.isEmpty()){
			Edge tmp=pQ.poll();//����ġ ������ ���� ���ð���
			int now=tmp.vex;//1
			int nowCost=tmp.cost;//0
			if(nowCost>dis[now]) continue;//0>0 /(2,11)(2,12)�� ���� �� �̹� 11�ߴµ� 12�� �ʿ� ����.
			for(Edge ob : graph.get(now)){//1�� �����ִ� ������ ����ġ(2,12)(3,4)
				if(dis[ob.vex]>nowCost+ob.cost){//dis[2]�� ����>0+12 ó���� �����̴ϱ� ������ ���
					dis[ob.vex]=nowCost+ob.cost;//�����
					pQ.offer(new Edge(ob.vex, nowCost+ob.cost));//�׸��� pq�� ������ �ּҺ���̶�� ������ �� �־���
				}
			}
		}
	}

	public static void main(String[] args){
		Ex5 T = new Ex5();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();//������
		m=kb.nextInt();//������
		graph = new ArrayList<ArrayList<Edge>>();
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Edge>());
		}
		dis=new int[n+1];//���� 1���ͽ���
		Arrays.fill(dis, Integer.MAX_VALUE);//���� ū������ �ʱ�ȭ
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			graph.get(a).add(new Edge(b, c));//a�� ���� �ִ� ����� ����ġ
		}
		T.solution(1);//1�� ����
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