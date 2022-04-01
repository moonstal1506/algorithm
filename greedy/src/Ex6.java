
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

//6.친구인가
public class Ex6 {
	static int[] unf;
	public static int Find(int v){//v학생의 집합번호를 리턴해준다 1을 호출하면 2를 호출하고 2가 3을 호출 다 같은 번호 리턴받음(친구일 경우)
		if(v==unf[v]) return v;//인덱스 번호와 배열값
		else return unf[v]=Find(unf[v]);//경로 압축
	}
	public static void Union(int a, int b){
		int fa=Find(a);//1
		int fb=Find(b);//2
		if(fa!=fb) unf[fa]=fb;//1!=2 같지 않으면 같게 해줌 unf[1]=2 같은 집합인 걸 나타냄
	}
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();//학생수
		int m=kb.nextInt();//숫자쌍
		unf=new int[n+1];//같은 집합인지 나타낼 배열
		for(int i=1; i<=n; i++) unf[i]=i;//학생 넣어줌
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