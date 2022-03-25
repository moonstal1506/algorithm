package stackQueue;

import java.util.Scanner;
import java.util.Stack;

//3. 크레인인형뽑기
//이차원배열크기입력 받고 넣어줌
//배열크기 입력받고 넣어줌
//점수는 0초기화
//스택만들어
//moves배열 돌려 판의 행길이까지 돌려
//그곳이 영이 아니라면 임시변수에 담고 0으로 바꿔
//스택이 비어있지 않고 임시변수가 맨위랑 같을때 답2증가하고 없애기
//아니라면 스택에 쌓는다 
//인형꺼냈으면  break하는거 잊지말기!!
public class Ex3 {
	private static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack=new Stack<>();
		for(int pos:moves) {
			for(int i=0;i<board.length;i++) {
				if(board[i][pos-1]!=0) {
					int tmp=board[i][pos-1];
					board[i][pos-1]=0;
					if(!stack.isEmpty()&&tmp==stack.peek()) {
						answer+=2;
						stack.pop();
					}
					else stack.push(tmp);
					break;
				}
			}
		}
		
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] board= new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]=kb.nextInt();
			}
		}
		int m = kb.nextInt();
		int[] moves= new int[m];
		for(int i=0;i<m;i++) {
			moves[i]=kb.nextInt();
		}
		System.out.print(solution(board,moves));
		
	}

}
