package hashMapTreeSet;

import java.util.Scanner;
import java.util.HashMap;

//2.�Ƴ��׷�
//String 2�� �Է¹޾�
//���� yes�� �ʱ�ȭ
//�ؽ��ʸ���� Ű�� �� �־���
//�ι�° �ܾ�鼭 Ű����? ����0���� Ȯ�� ��
//������ ���� ���� ���ҽ�Ŵ
public class Ex2 {
	private static String solution(String a,String b) {
		String answer="YES";
		HashMap<Character, Integer> map= new HashMap<>();
		for(char key: a.toCharArray()) {
			map.put(key, map.getOrDefault(key, 0)+1);
			
		}
		for(char key:b.toCharArray()) {
			if(!map.containsKey(key)||map.get(key)==0) {
				return "NO";
			}else {
				map.put(key, map.get(key)-1);
			}
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String a=kb.next();
		String b=kb.next();
		System.out.print(solution(a,b));
		
	}

}
