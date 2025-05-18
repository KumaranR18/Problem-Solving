You are given a string s, and your task is to reverse the string.

Examples:

Input: s = "Geeks"
Output: "skeeG"

Input: s = "for"
Output: "rof"

Input: s = "a"
Output: "a"

class Solution {
    public static String reverseString(String s) {
        String reverse = "";
        int n = s.length();
        for (int i=n-1; i>=0; i--){
            reverse += s.charAt(i);
        }
        return reverse;
    }
}