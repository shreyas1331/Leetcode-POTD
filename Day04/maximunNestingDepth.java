package Day04;

public class maximunNestingDepth {

	public static void main(String[] args) {
		String s="(1+(2*3)+((8)/4))+1";
		System.out.println(maxDepth(s));
	}
	public static int maxDepth(String s) {
        int opencount=0; int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                opencount++;
                
            }
            max=Math.max(opencount,max);
            if(s.charAt(i)==')'){
                opencount--;
            }
        }
        return max;
    }

}
