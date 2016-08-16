public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 2 || nums == null){
            return false;
        }
        HashMap<Integer, Integer> number = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (!number.containsKey(nums[i])){
                number.put(nums[i], i);
            }else if (i - number.get(nums[i]) <= k){
                return true;
            }else {
                number.put(nums[i], i);
            }
        }
        return false;
    }
}