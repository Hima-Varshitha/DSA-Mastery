import java.util.*;
public class Code{
    public static void main(String[] args){
        String strs = "abbaca";
        System.out.println(removeDuplicates(strs));
    }
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(!stack.empty() && c == stack.peek()){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character c: stack){
            sb.append(c);
        }
        return sb.toString();
    }
}