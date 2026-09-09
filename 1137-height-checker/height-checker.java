class Solution {
    public int heightChecker(int[] heights) {

        int expect []=new int [heights.length];
        int k=0;

        for(int num:heights){
            expect[k]=num;
            k++;
        }
        Arrays.sort(expect);
        int count=0;

        for(int i=0;i<heights.length;i++){
           if(heights[i]!=expect[i]){
            count++;
           }
       
        }
        return count;
      
        
    }
}