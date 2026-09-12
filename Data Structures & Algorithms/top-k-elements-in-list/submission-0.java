class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqq = new HashMap<>();

        for(int num : nums)
        freqq.put(num, freqq.getOrDefault(num,0)+1);

        List<Integer>[] bucket = new ArrayList[nums.length+1];

        for(int num : freqq.keySet())
        {
            int count = freqq.get(num);

            if(bucket[count] == null)
            bucket[count] = new ArrayList<>();

            bucket[count].add(num);
        }

        int[] ans = new int[k];
        int index=0;

        for(int count = bucket.length-1; count >= 0 && index < k; count--)
        {
            if(bucket[count] != null)
            {
                for(int num : bucket[count])
                {
                    ans[index++] = num;

                    if(index == k)
                    break;
                }
            }
        }

        return ans;
    }
}
