package Day11;
import java.util.*;
public class RemoveKdigits {

	public static void main(String[] args) {
		String num="1432219";
		int k=3;
		System.out.println(removeKdigits(num,k));
	}
	public static String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(char digit:num.toCharArray()){
            while(k>0 && !st.isEmpty() && st.peek()>digit){
                st.pop();
                k--;
            }
            st.push(digit);
        }
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        System.out.print(st);
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()==0?"0":sb.toString();
    }
}
