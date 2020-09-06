// https://leetcode.com/problems/minimum-deletion-cost-to-avoid-repeating-letters/
class Solution {
    // tc -> n, sc-> 1
    public int minCost(String s, int[] cost) {
        int n = cost.length;
        int minCount = 0;
        
        for(int i=0; i<n;i++){
            int max = cost[i];
            int sum = cost[i];
            
            int j = i;
            
            while(j<n-1 && s.charAt(j)==s.charAt(j+1)){
                sum += cost[j+1];
                max = Math.max(max, cost[j+1]);
                j++;
            }
            
            i = j;            
            
            minCount += sum - max;            
        }
        
        return minCount;
    }
}
