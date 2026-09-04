class Solution {
    // public boolean numberHasDigits(int num){

    //    // 1st Approach
    //     int digitsCount=0;
    //     while(num!=0){
    //         num=num/10;
    //         digitsCount++;
    //     }
    //     return digitsCount %2==0;
    // }
    // public int findNumbers(int[] nums) {
       

    //     int evenCount=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(numberHasDigits(nums[i])){
    //             evenCount++;
    //         }
    //     }
    //     return evenCount;



    //2nd approach

    // public int findNumbers(int[] nums) {
    //     int evenCount=0;
    //     for(int num:nums){
    //         int len=String.valueOf(num).length();
    //         if(len%2==0){
    //             evenCount++;
    //         }
    //     }
    //     return evenCount;
    // }


    //3rd approach

    // public int findNumbers(int[] nums) {
    //     int evenCount=0;
    //     for(int num:nums){
    //        int digitCount= (int)Math.floor(Math.log10(num))+1;
    //         if(digitCount%2==0){
    //             evenCount++;
    //         }
    //     }
    //     return evenCount;
    // }


    //4th Approach

     public int findNumbers(int[] nums) {
        int evenCount=0;
        for(int num:nums){
          
          if( (num >=10 && num<=99) || (num >=1000 && num<=9999) || (num ==100000 )){
            evenCount++;
          }
        }
        return evenCount;
    }



    
        
    
}