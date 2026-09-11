class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

    //1st Approach but not submit beacuse of time limit exceeds its time complexity 
    //tc(O(n^2))

    // for(int i=0;i<nums.length;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         if(nums[i]==nums[j] && j-i <=k){
    //             return true;
    //         }
    //     }
    // }
    // return false;

    //2nd Approach (Optimize code)

    Map<Integer,Integer> map =new HashMap<>();

    for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            int previousIndex =map.get(nums[i]);

             if(i-previousIndex <= k){
                 return true;
             }
        }
       
        map.put(nums[i],i);
    }
        return false;
    }
}