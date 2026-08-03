import java.util.*;
public class Code{
    public static void main(String[] args){
        String strs = "()[]{}";
        System.out.println(isValid(strs));
    }
    public static boolean isValid(String s) {
        if(s.length()%2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            switch(ch){
                case ')' :
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }
                    else return false;
                    break;
                case ']' :
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }
                    else return false;
                    break;
                case '}' :
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    }
                    else return false;
                    break;
                default: 
                    stack.push(ch);
            }
            
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}