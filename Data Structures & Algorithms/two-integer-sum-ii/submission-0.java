class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;

        while(l<r)
        {
            int targett = numbers[l]+numbers[r];

            if(targett < target)
            l++;
            else if(targett == target)
            return new int[]{l+1, r+1};
            else
            r--;
        }

        return new int[]{};
    }
}
