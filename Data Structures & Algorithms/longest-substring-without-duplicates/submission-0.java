class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> sett = new HashSet<>();

        int l=0;
        int r=0;
        int max=0;

        while(r < s.length())
        {
            while(sett.contains(s.charAt(r)))
            {
                sett.remove(s.charAt(l));
                l++;
            }

            sett.add(s.charAt(r));

            max=Math.max(max, r-l+1);

            r++;
        }


        return max;
    }
}
