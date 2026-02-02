class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        int[] out = new int[2];
        for(int i = 0; i < nums.length; i++){

            if(m.containsKey(target - nums[i])){
                out[0] = m.get(target-nums[i]);
                out[1] = i;
                break;
            }
            m.put(nums[i], i);

        }
        return out;
    }
}