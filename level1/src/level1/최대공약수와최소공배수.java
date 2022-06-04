package level1;

class 최대공약수와최소공배수 {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        answer[0]=gcr(n,m);
        answer[1]=n*m/answer[0];
        
        return answer;
    }
	
	static int gcr(int a,int b) {
		if(a%b==0) {
			return b;
		}
		return gcr(b,a%b);
	}
}