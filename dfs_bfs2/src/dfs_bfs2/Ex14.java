package dfs_bfs2;

import java.util.ArrayList;
import java.util.Scanner;

//15. 피자배달거리(DFS)

public class Ex14 {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point> hs, pz;

	// m개까지 뽑을거니까 L==m까지 하고 거리합 집 돌리고 거리 조합돌려 구함 합에 거리 더해줌
	// 조합 다 만들어질때까지 com배열에 i, DFS
	public void DFS(int L, int s) {
		if(L==m){
			int sum=0;
			for(Point h : hs){
				int dis=Integer.MAX_VALUE;
				for(int i : combi){
					dis=Math.min(dis, Math.abs(h.x-pz.get(i).x)+Math.abs(h.y-pz.get(i).y));
				}
				sum+=dis;
			}
			answer=Math.min(answer, sum);
		
		}else{
			for(int i=s; i<len; i++){
				combi[L]=i;
				DFS(L+1, i+1);
			}
		}
	}

	public static void main(String[] args) {
		Ex14 T = new Ex14();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pz = new ArrayList<>();
		hs = new ArrayList<>();

		// 1이면 집 2이면 피자

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int tmp=kb.nextInt();
				if(tmp==1) {
					hs.add(new Point(i,j));
				}
				if(tmp==2) {
					pz.add(new Point(i,j));
				}
				
			}
		}

		// DFS로 조합만들기 len combi
		len=pz.size();
		combi=new int[m];
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
