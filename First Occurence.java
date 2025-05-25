First Occurence

Find the first occurrence of the string pat in the string txt. The function returns an integer denoting the first occurrence of the string pat in txt (0-based indexing).

Note: You are not allowed to use the inbuilt function. If there is no occurrence then return -1.

Examples :

Input: txt = "GeeksForGeeks", pat = "Fr"
Output: -1
Explanation: Fr is not present in the string GeeksForGeeks as substring.

Input: txt = "GeeksForGeeks", pat = "For"
Output: 5
Explanation: For is present as substring in GeeksForGeeks from index 5 (0 based indexing).

Input: txt = "GeeksForGeeks", pat = "gr"
Output: -1
Explanation: gr is not present in the string GeeksForGeeks as substring.


class Solution {
    int firstOccurrence(String txt, String pat) {
        int str1 = txt.length();
        int str2 = pat.length();
        for (int i = 0; i <= str1 - str2; i++) {
            int j = 0;
            while (j < str2 && txt.charAt(i + j) == pat.charAt(j)) {
                j++;
            }
            if (j == str2) {
                return i;
            }
        }
        return -1;
    }
}


