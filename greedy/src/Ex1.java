
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//1.씨름선수
//그리디  현재에서 최선의 선택
public class Ex1 {
	public int solution(ArrayList<Body> arr, int n){
		int cnt=0;
		Collections.sort(arr);//키 내림차순 정렬
		int max=Integer.MIN_VALUE; //최소값 적어놓고
		for(Body ob : arr){//꺼내서 몸무게 비교
			if(ob.w>max){
				max=ob.w;
				cnt++;//첫번째 사람은 무조건임
			}
		}
		return cnt;
	}

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
		System.out.println(T.solution(arr, n));
	}
}

class Body implements Comparable<Body>{
    public int h, w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body o){
        return o.h-this.h;//키 내림차순 정렬
    }
}