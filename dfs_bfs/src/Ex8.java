import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//8.송아지 찾기
//중복된건 다시 넣지 않는다.
public class Ex8 {
	int answer=0;
	int[] dis={1, -1, 5};
	int[] ch;//체크배열
	Queue<Integer> Q = new LinkedList<>();
	public int BFS(int s, int e){
		ch=new int[10001];//좌표가 1부터 10000까지
		ch[s]=1;//첫번째 값 들어온 것 체크
		Q.offer(s);
		int L=0;
		while(!Q.isEmpty()){
			int len=Q.size();
			for(int i=0; i<len; i++){
				int x = Q.poll();
//				if(nx==e){
//					return L;
//				} 가능하지만 부모레벨에서 하는게 더 좋다
				for(int j=0; j<3; j++){//움직이기=자식구하기
					int nx=x+dis[j];
					if(nx==e){
						return L+1;//자식에서 바로 리턴해야 더 좋다 현재 부모레벨이므로+1
					}
					if(nx>=1 && nx<=10000 && ch[nx]==0){ 
						ch[nx]=1; //중복되지 않은 수에 1로 체크
						Q.offer(nx);//큐에 넣어줌
					}
				}
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args){
		Ex8 T = new Ex8();
		Scanner kb = new Scanner(System.in);
		int s=kb.nextInt();
		int e=kb.nextInt();
		System.out.println(T.BFS(s, e));
	}	
}