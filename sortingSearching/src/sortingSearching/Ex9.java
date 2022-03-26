package sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

//10.������ ���ϱ� �����˰���
//������ �� ������ ��ǥ �Է¹޾� �ִ�Ÿ�����
//�����ؼ� lt�� 1 rt�� �迭�� ������ �ʱ�ȭ
//rt�� ũ�ų� ���� �� ������ �ɰ��� �ִ�Ÿ�
//count �Լ� �迭�� �Ÿ��� �Ѱ� ���� ������ ũ�ų� ������ ��ȿ�ѰŴ�
//�ɰ��� ������ �ϰ� lt�� �ø���
//�ƴϸ�  rt�� ���δ�.
//
//count �Լ��� �迭�� �Ÿ��� �Ѱܹ޾� ���� ��1�� �ʱ�ȭ
//�迭 0��°�� ��ġ
//1���� �迭���̱��� �ݺ� i��°�� �������� �Ÿ��� �ִ�Ÿ�����ũ�ų� ������ ��ȿ�Ѱ� 
//cnt++�ϰ� �������� i������ �ٲ۴�.
public class Ex9 {
	public static int count(int[] arr, int dist) {
		int cnt=1;
		int ep=arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]-ep>=dist){
				cnt++;
				ep=arr[i];
			}
		}
		return cnt;
	}
	
	public static int solution(int n,int c, int[] arr) {
		int answer=0;
		Arrays.sort(arr);
		int lt=1;
		int rt=arr[n-1];
		while(lt<=rt){
			int mid=(lt+rt)/2;
			if(count(arr, mid)>=c){
				answer=mid;
				lt=mid+1;
			}
			else rt=mid-1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int c = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=kb.nextInt();
		System.out.println(solution(n, c, arr));
	}

}