class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = nums.length;
        int b = nums.length;
        for(int i=0 ; i<a; i++){
            for(int j=i+1;j<b;j++){
                if((nums[i]+nums[j])==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
