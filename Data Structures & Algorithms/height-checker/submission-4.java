class Solution {
    public int heightChecker(int[] heights) {
        int[] a1 = new int[heights.length];
        int i=0;
       for(int num:heights){
        a1[i]=num;
        i++;
       }
        Arrays.sort(a1);

        int count = 0;
        for( i=0;i<heights.length;i++){
            if(heights[i]!=a1[i]){
                count++;
            }
        }
        return count ;
    }
}