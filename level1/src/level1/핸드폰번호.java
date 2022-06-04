package level1;

class 핸드폰번호 {
	public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);
        for(int i=0;i<phone_number.length()-4;i++) {
        	sb.setCharAt(i, '*');
        }
        String answer=sb.toString();
        return answer;
    }
}