
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//7.�������� ũ�罺Į
//����ġ���� �ּҷ� ����� ���� ��
//Ʈ���� �׷��� ����: Ʈ���� ȸ�ΰ� �������� ����
//����ġ �������� ����
//������ �����س����� ��
//���������ϸ� ģ�� �ϳ��� ����
//�̹� ����Ǿ��ִ��� Ȯ���ؾ��� ȸ�ΰ� �Ǹ� �ȵ�
public class Ex7 {
	static int[] unf;
	public static int Find(int v){
		if(v==unf[v]) return v;
		else return unf[v]=Find(unf[v]);
	}
	public static void Union(int a, int b){//���� ģ���ε� �ٸ� ���� ���������� b�ɷ� ���� ���� 
		int fa=Find(a);
		int fb=Find(b);
		if(fa!=fb) unf[fa]=fb;
	}
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();//���� ��
		int m=kb.nextInt();//���� ��
		unf=new int[n+1];
		ArrayList<Edge2> arr=new ArrayList<>();
		for(int i=1; i<=n; i++) unf[i]=i;
		for(int i=0; i<m; i++){
			int a=kb.nextInt();//a��b����
			int b=kb.nextInt();
			int c=kb.nextInt();//����ġ
			arr.add(new Edge2(a, b, c));
		}
		int answer=0;
		Collections.sort(arr);//����
		for(Edge2 ob : arr){//����ġ ������ ���� �����س���
			int fv1=Find(ob.v1);
			int fv2=Find(ob.v2);
			if(fv1!=fv2){//���� �̹� ģ��? ó�� �����Ŵϱ� �信 �־���
				answer+=ob.cost;
				Union(ob.v1, ob.v2);//ģ���α�
			}
		}
		System.out.println(answer);
	}
}

class Edge2 implements Comparable<Edge2>{
    public int v1;
	public int v2;
	public int cost;
    Edge2(int v1, int v2, int cost) {
        this.v1 = v1;
		this.v2 = v2;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge2 ob){
        return this.cost-ob.cost;//������������ ����ġ�� �ּ� ���Ϸ���
    }
}