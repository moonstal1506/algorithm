package level1;

class 평균 {
	public double solution(int[] arr) {
		double sum=0;
        for(int i=0;i<arr.length;i++) {
        	sum+=arr[i];
        }
        double answer = sum/arr.length;
        return answer;
    }
}