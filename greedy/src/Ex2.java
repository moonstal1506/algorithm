
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//2. 회의실 배정

//시작 끝, 끝으로 정렬 같으면 시작으로
class Time implements Comparable<Time>{

	int start;
	int end;
	
	public Time(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Time o) {
		if(this.end-o.end==0) {
			return this.start-o.start;
		}
		return this.end-o.end;
	}
	
}

public class Ex2 {
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
		//정렬
		Collections.sort(arr);
		//cnt랑 끝시간 필요 시작시간이 앞에 끝시간과 같거나 크면 가능
		int cnt=0;
		int end=0;
		for(Time time: arr) {
			if(time.start>=end) {
				cnt++;
				end=time.end;
			}
		}
		System.out.println(cnt);
	}
}

