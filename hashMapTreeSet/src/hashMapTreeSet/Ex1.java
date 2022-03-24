package hashMapTreeSet;

import java.util.Scanner;
import java.util.HashMap;

//1.�б�ȸ��
//�л��� ��ǥ��� �Է¹޾�
//answer �ؽ��� �����
//�ݺ��ؼ� �ʿ��� Ű�� ������ؼ� �־�
//�ִ밪 ����
//���� Ű�� ���� ���� �ִ밪���� ���� Ű
public class Ex1 {
	private static char solution(int n,String s) {
		char answer= ' ';
		HashMap<Character, Integer> map=new HashMap<>();
		for(char x:s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		//System.out.println(map.containsKey('A')); true
		//System.out.println(map.size()); Ű ����:5
		//System.out.println(map.remove('C')); c�� �� ����
		
		int max=Integer.MIN_VALUE;
		for(char key:map.keySet()) {
			if(max<map.get(key)) {
				max=map.get(key);
				answer=key;
			}
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s=kb.next();
			System.out.print(solution(n,s));
		
	}

}
