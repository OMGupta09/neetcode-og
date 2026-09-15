class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] count = new int[26];

        // Frequency of characters we need
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            // Include s2[right] in window
            count[s2.charAt(right) - 'a']--;

            // Window became invalid -> remove from left
            while (count[s2.charAt(right) - 'a'] < 0) {
                count[s2.charAt(left) - 'a']++;
                left++;
            }

            // Window size == s1 size
            if (right - left + 1 == s1.length()) {
                return true;
            }
        }

        return false;
    }
}