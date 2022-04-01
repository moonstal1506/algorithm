
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//3.��ȥ��
//���������� �ͺ��� �Ѵ� �״����� ũ�ų� ����
//�����½ð��� ������ ���۽ð��� ��������
public class Ex3 {
	public int solution(ArrayList<Time2> arr){
		int answer=Integer.MIN_VALUE;
		Collections.sort(arr);//�ð��� ���� / e���������ͼ� ���ֱ�
		int cnt=0;
		for(Time2 ob : arr){
			if(ob.state=='s') cnt++;
			else cnt--;
			answer=Math.max(answer, cnt);//�ִ밪�϶� �ٲٱ�
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
			arr.add(new Time2(sT, 's'));//�ɰ��� ��Ƴ���
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
        if(this.time==ob.time) return this.state-ob.state;//���� �ð��� ���½ð��� ������  e�� ���� ������� �׷��� ī��Ʈ �ȵ�
		else return this.time-ob.time;//�ð� �������� ����
    }
}