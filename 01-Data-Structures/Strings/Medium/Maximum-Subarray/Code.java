public class Code{
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE, max_val = nums[0];
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum < 0) sum = 0;
            if(sum > max) max = sum;
            if(nums[i] > max_val) max_val = nums[i];
        }
        if(max == 0) return max_val;
        return max;
    }
}