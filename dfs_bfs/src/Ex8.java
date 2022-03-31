import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//8.�۾��� ã��
//�ߺ��Ȱ� �ٽ� ���� �ʴ´�.
public class Ex8 {
	int answer=0;
	int[] dis={1, -1, 5};
	int[] ch;//üũ�迭
	Queue<Integer> Q = new LinkedList<>();
	public int BFS(int s, int e){
		ch=new int[10001];//��ǥ�� 1���� 10000����
		ch[s]=1;//ù��° �� ���� �� üũ
		Q.offer(s);
		int L=0;
		while(!Q.isEmpty()){
			int len=Q.size();
			for(int i=0; i<len; i++){
				int x = Q.poll();
//				if(nx==e){
//					return L;
//				} ���������� �θ𷹺����� �ϴ°� �� ����
				for(int j=0; j<3; j++){//�����̱�=�ڽı��ϱ�
					int nx=x+dis[j];
					if(nx==e){
						return L+1;//�ڽĿ��� �ٷ� �����ؾ� �� ���� ���� �θ𷹺��̹Ƿ�+1
					}
					if(nx>=1 && nx<=10000 && ch[nx]==0){ 
						ch[nx]=1; //�ߺ����� ���� ���� 1�� üũ
						Q.offer(nx);//ť�� �־���
					}
				}
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args){
		Ex8 T = new Ex8();
		Scanner kb = new Scanner(System.in);
		int s=kb.nextInt();
		int e=kb.nextInt();
		System.out.println(T.BFS(s, e));
	}	
}