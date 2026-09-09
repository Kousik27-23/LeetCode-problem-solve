class Solution {
    public int thirdMax(int[] nums) {

        //1st Approach

        // Arrays.sort(nums);
        // int count=1;

        // for(int i=nums.length-1;i>0;i--){
        //     if(nums[i]!=nums[i-1]){
        //         count++;

        //     }
        //     if(count==3){
        //         return nums[i-1];
        //     }
        // }
        // return nums[nums.length-1];

        //2nd approach

        Long first=null,second=null,third=null;

        for(int num:nums){
            if(first!=null && num==first || second!=null && num==second || third!=null && num==third){
                continue;
            }
            if(first==null || num >first){
                third =second;
                second=first;
                first=(long)num;
            }
            else if(second == null || num > second){
                third=second;
                second=(long)num;
            }else if(third ==null || num > third){
                third=(long)num;
            }
        }
        if(third ==null){
            return first.intValue();
        }
        return third.intValue();
        
    }
}