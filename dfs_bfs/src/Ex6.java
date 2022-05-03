

//6. 부분집합 구하기(DFS)

public class Ex6 {
	public static int n;
	public static int[] ch;
	public static void DFS(int L) {
		if(L==n+1) {
			String answer="";
			for(int i=1;i<=n;i++) {
				if(ch[i]==1) {
					answer += i+" ";
				}
			}
			System.out.println(answer);
		}else {
			ch[L]=1;
			DFS(L+1);
			ch[L]=0;
			DFS(L+1);
		}
	}

	public static void main(String[] args){
		n=3;
		ch= new int[n+1];
		DFS(1);
		
	}
	
}

