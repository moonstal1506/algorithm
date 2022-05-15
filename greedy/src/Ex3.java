
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//3. 결혼식

//시간 상태
//시간 정렬 같으면 끝부터 빼야하니까 문자순
class People implements Comparable<People>{
	
	int time;
	char state;
	
	public People(int time, char state) {
		this.time = time;
		this.state = state;
	}

	@Override
	public int compareTo(People o) {
		if(this.time-o.time==0) {
			return this.state-o.state;
		}
		return this.time-o.time;
	}
	
}


public class Ex3 {
	public static void main(String[] args){
		Ex3 T = new Ex3();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		ArrayList<People> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int start=kb.nextInt();
			int end=kb.nextInt();
			arr.add(new People(start, 's'));
			arr.add(new People(end, 'e'));
		}
		
		//정렬, 답, cnt필요 왔으면 ++ 가면 -- 최대값을 답으로
		Collections.sort(arr);
		int answer=0;
		int cnt=0;
		for(People people : arr) {
			if(people.state=='s') {
				cnt++;
			}else {
				cnt--;
			}
			answer= Math.max(answer, cnt);
		}
		System.out.println(answer);
	}
}


