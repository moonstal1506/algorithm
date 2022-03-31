

//6.부분집합구하기

public class Ex6 {
	static int n;
	static int[] ch;
	public void DFS(int L){
		if(L==n+1){ //말단노드
			String tmp="";
			for(int i=1; i<=n; i++){
				if(ch[i]==1) tmp+=(i+" ");
			}
			if(tmp.length()>0) System.out.println(tmp);
		}
		else{
			ch[L]=1;//사용한다
			DFS(L+1);
			ch[L]=0;//안한다
			DFS(L+1);
		}
	}

	public static void main(String[] args){
		Ex6 T = new Ex6();
		n=3;
		ch=new int[n+1]; //인덱스1부터 시작
		T.DFS(1);
	}	
}

