
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//3.결혼식
//먼저끝나는 것부터 한다 그다음게 크거나 같다
//끝나는시간이 같으면 시작시간도 오름차순
public class Ex3 {
	public int solution(ArrayList<Time2> arr){
		int answer=Integer.MIN_VALUE;
		Collections.sort(arr);//시간순 정렬 / e가먼저나와서 빼주기
		int cnt=0;
		for(Time2 ob : arr){
			if(ob.state=='s') cnt++;
			else cnt--;
			answer=Math.max(answer, cnt);//최대값일때 바꾸기
		}
		return answer;
	}

	public static void main(String[] args){
		Ex3 T = new Ex3();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		ArrayList<Time2> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int sT=kb.nextInt();
			int eT=kb.nextInt();
			arr.add(new Time2(sT, 's'));//쪼개서 담아놓고
			arr.add(new Time2(eT, 'e'));
		}
		System.out.println(T.solution(arr));
	}
}
class Time2 implements Comparable<Time2>{
    public int time;
	public char state;
    Time2(int time, char state) {
        this.time = time;
        this.state = state;
    }
    @Override
    public int compareTo(Time2 ob){
        if(this.time==ob.time) return this.state-ob.state;//오는 시간과 가는시간이 같으면  e를 먼저 빼줘야함 그래야 카운트 안됨
		else return this.time-ob.time;//시간 오름차순 정렬
    }
}