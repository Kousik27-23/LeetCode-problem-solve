class Solution {
    public int[] replaceElements(int[] arr) {
        
    //brute force :tc(O(n^2))

    // for(int i=0;i<arr.length;i++){
    //     int max=-1;

    //     for(int j=i+1;j<arr.length;j++){
    //         if(arr[j]>max){
    //             max=arr[j];
    //         }

    //     }
    //     arr[i]=max;
    // }
    // return arr;

    //Optimize solution 

    // int max=-1;

    // for(int i=arr.length-1;i>=0;i--){
    //     int temp=arr[i];
    //     arr[i]=max;
    //     if(temp > max){
    //         max=current;
    //     }
    // }
    // return arr;

    //3rd Approach

    int max=-1;
    for(int i=arr.length-1;i>=0;i--){
        int temp=arr[i];
        arr[i]=max;
        max=Math.max(temp,max);
    }
    return arr;
        
    }
}