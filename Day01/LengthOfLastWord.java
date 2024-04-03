package Day01;

public class LengthOfLastWord {

	public static void main(String[] args) {
		s=s.trim();
        int cnt=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                cnt++;
            }else {
                break;
            }
        }
        return cnt;

	}

}
