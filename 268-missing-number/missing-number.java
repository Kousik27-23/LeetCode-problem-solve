class Solution {
    public int missingNumber(int[] nums) {

        // //1st Approach tc(nlogn)
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=i){
        //         return i;
        //     }
        // }
        // return nums.length;

        //2nd Approach

        // int xOr=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     xOr =xOr ^ i ^ nums[i];
        // }
        // return xOr;

        //3rd approach

        int n=nums.length;
        int expected=n*(n+1)/2;
        int actualSum=0;
        for(int num:nums){
            actualSum+=num;

        }
        return expected-actualSum;
        
    }
}