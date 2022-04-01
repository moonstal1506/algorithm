
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//2. ȸ�ǽ� ����
//���������� �ͺ��� �Ѵ� �״����� ũ�ų� ����
//�����½ð��� ������ ���۽ð��� ��������
public class Ex2 {
	public int solution(ArrayList<Time> arr){
		int cnt=0;
		Collections.sort(arr);
		int et=0;
		for(Time ob : arr){
			if(ob.s>=et){//���۽ð��� �����½ð����� ũ�ų� ������� ȸ���� �� ����
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
    public int compareTo(Time o){//��������
        if(this.e==o.e) return this.s-o.s;//������ ���۽ð��� ���ض�
		else return this.e-o.e;
    }
}