Remove Duplicates from a String

Given a string s without spaces, the task is to remove all duplicate characters from it, keeping only the first occurrence.

Note: The original order of characters must be kept the same. 

Examples :

Input: s = "zvvo"
Output: "zvo"
Explanation: Only keep the first occurrence

Input: s = "gfg"
Output: "gf"
Explanation: Only keep the first occurrence



class Solution {
    String removeDups(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < res.length(); j++) {
                if (s.charAt(i) == res.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res += s.charAt(i);
            }
        }
        return res;
    }
}



