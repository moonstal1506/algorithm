package hashMapTreeSet;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

//4.모든 아나그램찾기
//문자열 두개 입력받기
//답 초기화
//해쉬맵 두개만들어
//b문자열의 키와값
//a맵은 b길이-1만큼 세팅해놓고 rt움직여
//같은지 비교 답++
//lt빼주기
//0이면 키에서 삭제
//lt++
public class Ex4 {
	private static int solution(String a, String b) {
		int answer = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		for (char x : b.toCharArray())
			bm.put(x, bm.getOrDefault(x, 0) + 1);
		int L = b.length() - 1;
		for (int i = 0; i < L; i++)
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
		int lt = 0;
		for (int rt = L; rt < a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
			if (am.equals(bm))
				answer++;
			am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
			if (am.get(a.charAt(lt)) == 0)
				am.remove(a.charAt(lt));
			lt++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();

		System.out.print(solution(a, b));

	}

}
