import java.util.*;
public class Code {
    public static void main(String[] args){
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
    public static int[] dailyTemperatures(int[] temp) {
        int[] answer = new int[temp.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=temp.length-1; i>=0; i--){
            while(!stack.isEmpty() && temp[stack.peek()] <= temp[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                answer[i] = stack.peek()-i;
            }
            stack.push(i);
        }
        return answer;
    }
}