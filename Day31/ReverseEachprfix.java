package Day31;
import java.util.*;
public class ReverseEachprfix {

	public static void main(String[] args) {
		String word = "abcdefd"; char ch ='d';
		System.out.println(f(word,ch));
		
	}
	public static String f(String word,char ch) {
	    
	        int idx = word.indexOf(ch)+1;
	        System.out.println(idx);
			StringBuffer rev = new StringBuffer(word.substring(0, idx));
			return rev.reverse()+word.substring(idx);
	    
	}

}
