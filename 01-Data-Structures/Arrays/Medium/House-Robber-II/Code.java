public class Code {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob2(nums));
    }
    public static int rob2(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        int maxMoney = Math.max(maxRob(nums, 0, n-1), maxRob(nums, 1, n));
        return maxMoney;
    }
    public static int maxRob(int[] nums, int start, int end){
        int[] dp = new int[end - start];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        int idx = 2;
        for(int i=start+2; i<end; i++){
            dp[idx] = Math.max(nums[i] + dp[idx-2], dp[idx-1]);
            idx++;
        }
        return dp[(end-start)-1];
    }
}
