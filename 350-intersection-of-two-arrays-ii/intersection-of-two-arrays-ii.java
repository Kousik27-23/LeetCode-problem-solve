class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        //1st approach(Using map)
        // Map<Integer,Integer> map =new HashMap<>();

        // for(int num:nums1){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }

        // int res[]=new int [nums1.length];
        // int k=0;

        // for(int num:nums2){
        //     int count=map.getOrDefault(num,0);
        //     if(count==0){
        //         continue;
        //     }
        //     else{
        //         res[k]=num;
        //         k++;
        //         map.put(num,count-1);
        //     }
        // }
        // return Arrays.copyOfRange(res,0,k);


        //2nd Approach
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int res[]=new int[nums1.length];
        int k=0,i=0,j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                res[k]=nums1[i];
                k++;
                j++;
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        return Arrays.copyOfRange(res,0,k);
        
    }
}