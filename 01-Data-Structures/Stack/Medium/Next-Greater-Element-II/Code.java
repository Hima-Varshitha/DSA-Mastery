import java.util.*;
public class Code {
    public static void main(String[] args){
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        int[] temp = new int[nums.length*2];
        int idx = 0, k = 0, x = 0;
        int[] ans = new int[nums.length];
        while(idx < temp.length){
            temp[idx++] = nums[k++];
            if(k == nums.length) k = 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int val = -1;
            for(int j=i+1; j<temp.length; j++){
                if(temp[j] > nums[i]){
                    val = temp[j];
                    break;
                }
            }
            ans[x++] = val;
        }
        return ans;
    }
}