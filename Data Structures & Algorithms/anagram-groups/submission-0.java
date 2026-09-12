class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for(String str : strs)
        {
            char[] ss = str.toCharArray();
            Arrays.sort(ss);

            String key = new String(ss);

            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(str);
        }

        return new ArrayList<>(ans.values());
    }
}
