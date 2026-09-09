class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        //1st Approach
        
        // boolean [] seen =new boolean[nums.length +1];

        // List<Integer> result =new ArrayList<>();

        // for(int num:nums){
        //     seen[num]=true;
        // }

        // for(int i=1;i<=nums.length;i++){
        //     if(!seen[i]){
        //         result.add(i);
        //     }
        // }
        // return result;

        //2nd Approach (Optimize approach)

        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]) - 1;

            if(nums[index]>0){
                nums[index]= -nums[index];
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result.add(i + 1);
            }
        }
        return result;
    }
}