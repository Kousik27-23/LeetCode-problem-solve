class Solution {
    public int removeElement(int[] nums, int val) {

        //1st Approach
        // int i=0;
        // for(int j=0;j<nums.length;j++){
        //     if(nums[j]!=val){
        //         nums[i]=nums[j];
        //         i++;
        //     }
        // }
        // return i;


        //2nd Approach

        int n=nums.length;
        int i=0;
       while(i<n){
        if(nums[i]==val){
            nums[i]=nums[n-1];
            n--;
        }else{
            i++;
        }
       }
       return n;
        
    }
}