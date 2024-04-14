// Solution with additional array and hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // We create an array of size 2 to store our 2 indexes
        int[] ans = new int[2];
        // We create a hashmap to reduce the time complexity
        // To store values of array along with their indices
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            // Key contains array number while value contains index
            if(hash.containsKey(target - nums[i])){
                ans[0] = hash.get(target - nums[i]);
                ans[1] = i;
            }
            // Storing values of array with their respective index
            hash.put(nums[i], i);
        }
        return ans;
    }
}