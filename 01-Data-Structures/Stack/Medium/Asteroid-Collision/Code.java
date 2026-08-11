import java.util.*;
public class Code {
    public static void main(String[] args){
        int[] asteroids = {3,5,-6,2,-1,4};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int asteroid : asteroids){
            boolean destroyed = false;
            while(!stack.isEmpty() && stack.peek() > 0 && asteroid < 0){
                int top = stack.peek();
                if(top < Math.abs(asteroid)){
                    stack.pop();
                }
                else if(top == Math.abs(asteroid)){
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else{
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed) stack.push(asteroid);
        }
        int[] ans = new int[stack.size()];
        int i = 0, n = (ans.length)-1;
        for(int num : stack){
            ans[n-i] = num;
            i++;
        }
        return ans;
    }
}