class Solution {
    public boolean containsDuplicate(int[] nums) {
        //1st Approach
        // //[1,2,3,1]
        // Arrays.sort(nums);
        // //[1,1,2,3]
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;

        //2nd Approach(set)

        Set<Integer> set =new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
        
    }
}