import java.util.*;
class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int k=0;k<n;k++){
            ans[k] = nums[k];
            ans[k+n] = nums[k];
            
        }
        return ans;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int[] result = obj.getConcatenation(nums);

        System.out.println(Arrays.toString(result));

    }
}