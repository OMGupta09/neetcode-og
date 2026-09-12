class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s : strs)
        sb.append(s.length())
        .append("#")
        .append(s);

        return sb.toString();
    }



    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (j < str.length() && str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            int start = j + 1;
            ans.add(str.substring(start, start + length));

            i = start + length;
        }

        return ans;
    }
}