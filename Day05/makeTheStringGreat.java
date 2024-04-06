package Day05;
import java.util.*;
public class makeTheStringGreat {

	public static void main(String[] args) {
		String s="leEeetcode";
		System.out.println(makeGood(s));
	}
	public static String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(st.size()==0) st.push(ch);
            else{
                if(Math.abs(st.peek()-ch)==32) st.pop();
                else st.push(ch);
            }
        }

        String ans = "";
        while(st.size()!=0){
            ans = st.pop()+ans;
        }
        return ans;
    }

}
