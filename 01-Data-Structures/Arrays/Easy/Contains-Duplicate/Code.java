import java.util.*;
public class Code{
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(!set.add(num)) return true;
        }
        return false;
    }
}