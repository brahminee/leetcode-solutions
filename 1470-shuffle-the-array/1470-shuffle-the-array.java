import java.util.*;
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int j=0;j<n;j++){
            ans[2*j] = nums[j]; 
            ans[2*j+1] = nums[n+j];

            
        }
        return ans;
        
    }
    
}