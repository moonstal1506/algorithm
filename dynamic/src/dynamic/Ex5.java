package dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//4.���� ���� ž�ױ�
public class Ex5 {
	static int[] dy;
	public int solution(ArrayList<Brick> arr){
		int answer=0;
		Collections.sort(arr);//���� �������� ���ĵǾ������ϱ� ���� ���Ը� �Ű澲���
		dy[0]=arr.get(0).h;//ù��°�� ���̷� �ʱ�ȭ
		answer=dy[0];//�䵵 ù��°��
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
		this.s = s;//��
        this.h = h;//��
        this.w = w;//����
    }
    @Override
    public int compareTo(Brick o){
        return o.s-this.s;//���̳�������
    }
}