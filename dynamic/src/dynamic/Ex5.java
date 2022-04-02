package dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//4.가장 높은 탑쌓기
public class Ex5 {
	static int[] dy;
	public int solution(ArrayList<Brick> arr){
		int answer=0;
		Collections.sort(arr);//넓이 내림차순 정렬되어있으니까 이제 무게만 신경쓰면됨
		dy[0]=arr.get(0).h;//첫번째꺼 높이로 초기화
		answer=dy[0];//답도 첫번째로
		for(int i=1; i<arr.size(); i++){
			int max_h=0;
			for(int j=i-1; j>=0; j--){//앞에꺼
				if(arr.get(j).w > arr.get(i).w && dy[j]>max_h){//무게가 더 크고 맥스높이보다 크면 맥스 바꿔주고
					max_h=dy[j];
				}
			}
			dy[i]=max_h+arr.get(i).h;//다음 높이는 최대값+현재 높이
			answer=Math.max(answer, dy[i]);//지금 최대값인가 비교
		}
		return answer;
	}

	public static void main(String[] args){
		Ex5 T = new Ex5();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		ArrayList<Brick> arr=new ArrayList<>();
		dy=new int[n];
		for(int i=0; i<n; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			arr.add(new Brick(a, b, c));
		}
		System.out.print(T.solution(arr));
	}
}

class Brick implements Comparable<Brick>{
    public int s, h, w;
    Brick(int s, int h, int w) {
		this.s = s;//넓
        this.h = h;//높
        this.w = w;//무게
    }
    @Override
    public int compareTo(Brick o){
        return o.s-this.s;//넓이내림차순
    }
}