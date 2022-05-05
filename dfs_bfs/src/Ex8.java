import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//8. 송아지 찾기1(BFS)
public class Ex8 {

	int[] ch = new int[10001];
	Queue<Integer> q = new LinkedList<>();
	int[] dis = { 1, -1, 5 };

	public int BFS(int s, int e) {
		q.add(s);
		ch[s]=1;
		int L = 0;
		while(!q.isEmpty()) {
			int len=q.size();
			for(int i=0; i<len;i++) {
				int x=q.poll();
				for(int d: dis) {
					int nx=x+d;
					if(nx==e) {
						return L+1;
					}
					if(1<=nx && nx<=10000 && ch[nx]==0) {
						ch[nx]=1;
						q.add(nx);
					}
				}
			}
			L++;
		}
		return L;

	}

	public static void main(String[] args) {
		Ex8 T = new Ex8();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int e = kb.nextInt();
		System.out.println(T.BFS(s, e));
	}
}