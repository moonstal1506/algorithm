package dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//4. 가장 높은 탑 쌓기(LIS 응용)

//벽돌 높이,넓이,무게  넓이 내림차순
class Brick implements Comparable<Brick>{
    public int s, h, w;
    Brick(int s, int h, int w) {
		this.s = s;
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Brick o){
        return o.s-this.s;
    }
}

public class Ex5 {

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		ArrayList<Brick> arr=new ArrayList<>();
		int[] dy=new int[n];
		for(int i=0; i<n; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			arr.add(new Brick(a, b, c));
		}
		
		//정렬 첫번째 높이로 초기화 
		//무게가 앞에꺼가 더 커야함 맥스보다 큰값  높이 더해줌 답과 비교
		Collections.sort(arr);
		dy[0]=arr.get(0).h;
		int answer=dy[0];
		for(int i=1; i<arr.size(); i++){
			int max_h=0;
			for(int j=i-1; j>=0; j--){//�տ���
				if(arr.get(j).w > arr.get(i).w && dy[j]>max_h){//���԰� �� ũ�� �ƽ����̺��� ũ�� �ƽ� �ٲ��ְ�
					max_h=dy[j];
				}
			}
			dy[i]=max_h+arr.get(i).h;//���� ���̴� �ִ밪+���� ����
			answer=Math.max(answer, dy[i]);//���� �ִ밪�ΰ� ��
		}
		System.out.print(answer);
	}
}
