
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//1. 씨름선수
//바디 클래스 Comparable상속 compareTo 키 내림차순 구현
class Body implements Comparable<Body> {
	int h;
	int w;
	
	public Body(int h, int w) {
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Body body) {
		return body.h-this.h;
	}
	
}

public class Ex1 {

	public static void main(String[] args){
		Ex1 T = new Ex1();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		ArrayList<Body> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int h=kb.nextInt();
			int w=kb.nextInt();
			arr.add(new Body(h, w));
		}
		//정렬
		Collections.sort(arr);
		//몸무게 앞사람과 비교 크면 가능 cnt 와 max필요
		int cnt=0;
		int max=Integer.MIN_VALUE;
		for(Body body : arr) {
			if(body.w>max) {
				cnt++;
				max=body.w;
			}
		}
		
		System.out.println(cnt);
	}
}

