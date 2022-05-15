
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//4. 최대수입스케쥴( PriorityQueue)
//돈과 시간 ,시간 내림차순
class Lecture implements Comparable<Lecture>{
	int money;
	int date;
	
	public Lecture(int money, int date) {
		super();
		this.money = money;
		this.date = date;
	}

	@Override
	public int compareTo(Lecture o) {
		return o.date-this.date;
	}
}

public class Ex4 {
	static int n, max=Integer.MIN_VALUE;
	
	public static void main(String[] args){
		Ex4 T = new Ex4();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int m=kb.nextInt();
			int d=kb.nextInt();
			arr.add(new Lecture(m, d));
			if(d>max) max=d;
		}
		
		//sum필요 PriorityQueue돈 내림차순
		//arr은 날짜 내림차순 정렬
		//마지막 날부터 돌면서 돈 집어넣기 날짜 변할때 멈춰서 큰돈 합하기
		int sum = 0;
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(arr);
		int j=0;
		for(int i =max;i>=1;i--) {
			for(;j<n;j++) {
				if(arr.get(j).date<i) {
					break;
				}
				q.add(arr.get(j).money);
			}
			if(!q.isEmpty()) {
				sum+=q.poll();
			}
		}
		System.out.println(sum);
	}
}