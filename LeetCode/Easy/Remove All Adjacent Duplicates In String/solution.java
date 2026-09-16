import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution{

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

       String str = "abbaca";
       System.out.println("String after removing adjacent duplicates: " + removeDuplicates(str));
    }
}