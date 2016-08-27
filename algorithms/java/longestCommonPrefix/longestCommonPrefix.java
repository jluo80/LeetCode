public class Solution {
    public String longestCommonPrefix(String[] strs) {
        //1. Horizontal scanning
        if(strs.length == 0 || strs == null) return "";

        int minLen = Integer.MAX_VALUE;
        for(String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        String minPre = strs[0].substring(0, minLen);
        for(int i = 1; i < strs.length; i++) {
            String strPre = strs[i].substring(0, minLen);
            while(strPre.indexOf(minPre) != 0) {
                minPre = minPre.substring(0, minPre.length() - 1);
                if(minPre.isEmpty()) return "";
            }
        }
        return minPre;
    }

    // public String longestCommonPrefix(String[] strs) {
    //     if (strs.length == 0) return "";
    //     String prefix = strs[0];
    //     for (int i = 1; i < strs.length; i++)
    //         while (strs[i].indexOf(prefix) != 0) {
    //             prefix = prefix.substring(0, prefix.length() - 1);
    //             if (prefix.isEmpty()) return "";
    //         }
    //     return prefix;
    // }

    //2. Divide and Conquer

    //3. Binary search tree

}