package Day06;
import java.util.*;
public class minimumToRemovetomakevalidParanthese {

	public static void main(String[] args) {
		String s="lee(t(c)o)de)";
		System.out.println(minRemoveToMakeValid(s));
	}
	public static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isAlphabetic(ch)) {
                continue;
            }
            if (ch == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>(stack);
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}
