import java.util.Scanner;


//7.점수계산 o
public class Ex7 {
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		int score=0;
		int count=0;
		for(int i=0;i<n;i++) {
			if(kb.nextInt()==1) {
				count++;
				score+=count;
			}else {
				count=0;
			}
		}
		System.out.println(score);
	}
}
