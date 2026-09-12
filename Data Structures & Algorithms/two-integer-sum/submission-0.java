class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapp=new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int needed = target - nums[i];

            if(mapp.containsKey(needed))
            return new int[]{mapp.get(needed), i};

            mapp.put(nums[i], i);
        }
        return new int[]{};
    }
}
