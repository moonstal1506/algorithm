
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//4.�ִ���Խ�����
//���� ū��¥���� �ְ� ��¥���� ��
public class Ex4 {
	static int n, max=Integer.MIN_VALUE;
	public int solution(ArrayList<Lecture> arr){
		int answer=0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); //�⺻�� �������켱�ε� reverseOrderū���켱
		Collections.sort(arr);//��¥ ��������
		int j=0;
		for(int i=max; i>=1; i--){//ū��¥���� �۾���
			for(; j<n; j++){//����
				if(arr.get(j).time<i) break;//0,1,2,3,4��°������ ��¥�� 3���� ������ �����
				pQ.offer(arr.get(j).money);//��¥�� ũ�ų� ���� pq ������ ���ǷḦ �ִ´�.
			}
			if(!pQ.isEmpty()) answer+=pQ.poll();//i��¥�� ���� ū ���Ƿ�
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
			if(d>max) max=d;//���� ū ��¥ ���ϱ�
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
        return ob.time-this.time;//�ð� ��������
    }
}