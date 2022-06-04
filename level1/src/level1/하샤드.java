package level1;

class 하샤드 {
	public boolean solution(int x) {
		boolean answer = true;
		int k=x;
		int sum=0;
		while(k!=0) {
			sum+=k%10;
			k/=10;
		}
		if(x%sum!=0) {
			answer=false;
		}
        return answer;
    }
}