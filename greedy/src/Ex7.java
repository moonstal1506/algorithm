
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//7.원더랜드 크루스칼
//가중치합이 최소로 만들어 내는 것
//트리와 그래프 차이: 트리는 회로가 존재하지 않음
//가중치 오름차순 정렬
//작은값 선택해나가면 됨
//간선연결하면 친구 하나의 집합
//이미 연결되어있는지 확인해야함 회로가 되면 안됨
public class Ex7 {
	static int[] unf;
	public static int Find(int v){
		if(v==unf[v]) return v;
		else return unf[v]=Find(unf[v]);
	}
	public static void Union(int a, int b){//둘은 친구인데 다른 값을 갖고있으면 b걸로 같게 해줘 
		int fa=Find(a);
		int fb=Find(b);
		if(fa!=fb) unf[fa]=fb;
	}
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();//도시 수
		int m=kb.nextInt();//간선 수
		unf=new int[n+1];
		ArrayList<Edge2> arr=new ArrayList<>();
		for(int i=1; i<=n; i++) unf[i]=i;
		for(int i=0; i<m; i++){
			int a=kb.nextInt();//a와b연결
			int b=kb.nextInt();
			int c=kb.nextInt();//가중치
			arr.add(new Edge2(a, b, c));
		}
		int answer=0;
		Collections.sort(arr);//정렬
		for(Edge2 ob : arr){//가중치 작은것 부터 선택해나감
			int fv1=Find(ob.v1);
			int fv2=Find(ob.v2);
			if(fv1!=fv2){//너희 이미 친구? 처음 만난거니까 답에 넣어줌
				answer+=ob.cost;
				Union(ob.v1, ob.v2);//친구맺기
			}
		}
		System.out.println(answer);
	}
}

class Edge2 implements Comparable<Edge2>{
    public int v1;
	public int v2;
	public int cost;
    Edge2(int v1, int v2, int cost) {
        this.v1 = v1;
		this.v2 = v2;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge2 ob){
        return this.cost-ob.cost;//오름차순정렬 가중치합 최소 구하려고
    }
}