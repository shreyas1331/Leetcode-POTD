package Day02;
import java.util.*;
public class isomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="add";
		String t="egg";
		boolean ans=isIsomorphic(s,t);
		System.out.println(ans);
	}
	public static boolean isIsomorphic(String s, String t) {
	     Map<Character, Character> mp = new HashMap<>();
	// //1.Consistent mapping 
	// //2.no two elements should have one value 
	     for(int i = 0; i <s.length(); i ++) {
	         Character sch=s.charAt(i);//e
	         Character tch=t.charAt(i);//a
	         
	         if(mp.containsKey(sch)){
	             if(mp.get(sch)!=tch)return false;
	         }
	         else if(mp.containsValue(tch)){return false;}
	         
	         else{
	             mp.put(sch,tch);
	         }
	     }
	     return true;
	}

}
