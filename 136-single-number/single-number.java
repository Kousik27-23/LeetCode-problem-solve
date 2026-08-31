class Solution {
    public int singleNumber(int[] nums) {
        //Using Map

        // Map<Integer,Integer> map=new HashMap<>();
        // for(int num:nums){
        //     if(!map.containsKey(num)){
        //         map.put(num,0);
        //     }
        //     map.put(num,map.get(num)+1);
        // }
        // for(int num:nums){
        //     if(map.get(num)==1){
        //         return num;
        //     }
        // }
        // return -1;
        


        //Using XoR

        int res=0;
        for(int num:nums){
            res=res^num;
        }
        return res;
    }
}