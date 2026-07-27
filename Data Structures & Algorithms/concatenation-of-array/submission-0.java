class Solution {
    public int[] getConcatenation(int[] nums) {
        int a= nums.length;
        int[] ans = new int[2*nums.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[i%a];
        }
        return ans;   
    }
}