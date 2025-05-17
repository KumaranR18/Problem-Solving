class Solution {
    int missingNum(int arr[]) {
        int n, sum2 = 0;
        long sum1;
        n = arr.length + 1;
        sum1 = (long) n*(n+1)/2;
        for (int i=0; i<arr.length; i++){
            sum2 += arr[i];
        }
        return (int) sum1 - sum2;
    }
}