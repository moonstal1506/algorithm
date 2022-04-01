
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//4.최대수입스케줄
//제일 큰날짜부터 넣고 날짜마다 비교
public class Ex4 {
	static int n, max=Integer.MIN_VALUE;
	public int solution(ArrayList<Lecture> arr){
		int answer=0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); //기본은 작은값우선인데 reverseOrder큰값우선
		Collections.sort(arr);//날짜 내림차순
		int j=0;
		for(int i=max; i>=1; i--){//큰날짜부터 작아짐
			for(; j<n; j++){//강의
				if(arr.get(j).time<i) break;//0,1,2,3,4번째강의의 날짜가 3보다 작으면 멈춰라
				pQ.offer(arr.get(j).money);//날짜가 크거나 같다 pq 강좌의 강의료를 넣는다.
			}
			if(!pQ.isEmpty()) answer+=pQ.poll();//i날짜의 가장 큰 강의료
		}
		return answer;
	}

	public static void main(String[] args){
		Ex4 T = new Ex4();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int m=kb.nextInt();
			int d=kb.nextInt();
			arr.add(new Lecture(m, d));
			if(d>max) max=d;//가장 큰 날짜 구하기
		}
		System.out.println(T.solution(arr));
	}
}

class Lecture implements Comparable<Lecture>{
    public int money;
	public int time;
    Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }
    @Override
    public int compareTo(Lecture ob){
        return ob.time-this.time;//시간 내림차순
    }
}