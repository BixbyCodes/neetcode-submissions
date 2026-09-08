class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Arrays.fill(result, 0); 
        for(int i=0;i<temperatures.length-1;i++){
            int ct = temperatures[i];
        for(int j=i+1;j<temperatures.length;j++){
            int ut= temperatures[j];
            if(ct<ut){
                result[i]=j-i;
                break;
            }
        }
        }
        return result;
    }
}
