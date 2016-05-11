import java.util.Hashtable;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            hashtable.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (hashtable.containsKey(complement) && hashtable.get(complement) != i){
                result[0] = hashtable.get(complement);
                result[1] = i;
            }
        }
    return result;
    }
}