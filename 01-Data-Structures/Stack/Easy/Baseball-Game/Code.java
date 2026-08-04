import java.util.*;
public class Code{
    public static void main(String[] args){
        String[] op = {"5","2","C","D","+"};
        System.out.println(calPoints(op));
    }
    public static int calPoints(String[] op) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<op.length; i++){
            if(op[i].equals("+")){
                    int last = stack.pop();
                    int sum = last + stack.peek();
                    stack.push(last);
                    stack.push(sum);
                }
            else if(op[i].equals("D")){
                if(!stack.empty()) stack.push(stack.peek() * 2);
            }
            else if(op[i].equals("C")){
                if(!stack.empty()) stack.pop();
            }
            else if(Character.isDigit(op[i].charAt(0))){
                stack.push(Integer.parseInt(op[i]));
            }
            else{
                stack.push(Integer.parseInt(op[i]));
            }
        }
        int total = 0;
        for(Integer num: stack) total += num;
        return total;
    }
}