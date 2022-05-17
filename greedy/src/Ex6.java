
import java.util.Scanner;

//6. 친구인가(Uion&Find)
public class Ex6 {
	static int[] unf;
	
	//어느집합에 속하는지 찾기
	//번호 집합 같으면 그대로
	//다르면 그친구 번호껄로 찾기
	public static int Find(int v){
		if(v==unf[v]) return v;
		else return unf[v]=Find(unf[v]);
	}
	
	//어느집합인지 찾고 다르면 친구만들어주기 a집합에 b값넣기
	public static void Union(int a, int b){
		int fa=Find(a);
		int fb=Find(b);
		if(fa!=fb) unf[fa]=fb;
	}
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		unf=new int[n+1];
		for(int i=1; i<=n; i++) unf[i]=i;
		for(int i=1; i<=m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			Union(a, b);
		}
		int a=kb.nextInt();
		int b=kb.nextInt();
		int fa=Find(a);
		int fb=Find(b);
		if(fa==fb) System.out.println("YES");
		else System.out.println("NO");		
	}
}