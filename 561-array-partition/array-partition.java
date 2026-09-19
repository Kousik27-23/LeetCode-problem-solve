class Solution {
    public int arrayPairSum(int[] nums) {
        //1st approach
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-1;i+=2){
            sum+=nums[i];
        }
        return sum;
        
    }
}