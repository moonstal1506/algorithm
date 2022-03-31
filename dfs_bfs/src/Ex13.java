import java.util.ArrayList;
import java.util.Scanner;

//13. 경로탐색 인접리스트 ArrayList
//앞의 경우 정점이 많아지면 비효율적임
//정점 개수만큼 어레이리스트 만들어 담아
public class Ex13 {
	
	static int n, m, answer=0;
	static ArrayList<ArrayList<Integer>> graph;//정수 저장하는 어레이리스트의 어레이리스트
	static int[] ch;
	
	public void DFS(int v){
		if(v==n) answer++;//도착
		else{
			for(int nv : graph.get(v)){//v번 어레이리스트의 값 꺼내줌
				if(ch[nv]==0){//방문안했냐?
					ch[nv]=1;//체크
					DFS(nv);
					ch[nv]=0;//체크 취소
				}
			}
		}
	}
	
	public static void main(String[] args){
		Ex13 T = new Ex13();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Integer>());//객체생성
		}
		ch=new int[n+1];
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			graph.get(a).add(b);//a번째 어레이리스트에 b넣어줌
		}
		ch[1]=1;//체크
		T.DFS(1);
		System.out.println(answer);
	}	
}