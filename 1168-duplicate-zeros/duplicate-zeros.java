class Solution {
    public void duplicateZeros(int[] arr) {

        //1st Approach

        // int dest[]=new int[arr.length];
        // int s=0,d=0;

        // while(s<arr.length){
        //     if(arr[s]==0){
        //         if(d<arr.length){
        //              dest[d]=0;
        //         }
               
        //         d++;
        //         if(d<arr.length){
        //              dest[d]=0;
        //         }
                
        //     }else{
        //         if(d<arr.length){
        //             dest[d]=arr[s];
        //         }
                
        //     }
        //     d++;
        //     s++;
        // }
        // for(int i=0;i<arr.length;i++){
        //    arr[i]=dest[i];
        // }

        //2nd approach

        int possibleZeroDups=0;
        int lastIdx=arr.length-1;

        for(int i=0;i<=lastIdx-possibleZeroDups;i++){
            if(arr[i]==0){
            //edge case
            if(i==lastIdx-possibleZeroDups){
                arr[lastIdx]=0;
                lastIdx--;
                break;
            }

            possibleZeroDups++;

        }
        }
    int newLastIdx = lastIdx-possibleZeroDups;
    for(int i=newLastIdx;i>=0;i--){
        if(arr[i]==0){
            arr[i+possibleZeroDups]=0;
            possibleZeroDups--;
            arr[i+possibleZeroDups]=0;

        }else{
            arr[i+possibleZeroDups]=arr[i];
        }
    }
    }
}