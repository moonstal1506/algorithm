
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//2. 회의실 배정
//먼저끝나는 것부터 한다 그다음게 크거나 같다
//끝나는시간이 같으면 시작시간도 오름차순
public class Ex2 {
	public int solution(ArrayList<Time> arr){
		int cnt=0;
		Collections.sort(arr);
		int et=0;
		for(Time ob : arr){
			if(ob.s>=et){//시작시간이 끝나는시간보다 크거나 같은경우 회의할 수 있음
				cnt++;
				et=ob.e;
			}
		}
		return cnt;
	}

	public static void main(String[] args){
		Ex2 T = new Ex2();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int x=kb.nextInt();
			int y=kb.nextInt();
			arr.add(new Time(x, y));
		}
		System.out.println(T.solution(arr));
	}
}

class Time implements Comparable<Time>{
    public int s, e;
    Time(int s, int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o){//오름차순
        if(this.e==o.e) return this.s-o.s;//같으면 시작시간도 비교해라
		else return this.e-o.e;
    }
}