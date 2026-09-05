class Solution {
    public int[] sortedSquares(int[] nums) {

        //1st Approach
        //tc:-O(nlogn)
        //sc:O(n);

        // int res []=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     res[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(res);
        // return res;
        
        //2nd approach

        //tc:O(n)
        //sc:O(n)
        int n=nums.length;
        int l=0,r=n-1;
        int res []=new int [n];
        for(int i =n-1;i>=0;i--){
            int val;
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                val=nums[l];
                l++;
            }else{
                val=nums[r];
                r--;
            }
            res[i]=val*val;
        }
        return res;
    }
}