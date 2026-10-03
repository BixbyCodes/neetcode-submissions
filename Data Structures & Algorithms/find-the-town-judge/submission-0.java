class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int[] incoming = new int[n+1];
        int[] outcoming = new int[n+1];
        for(int i=0;i<trust.length;i++){
            int truster = trust[i][0];
    int trusted = trust[i][1];
    
    outcoming[truster]++;
    incoming[trusted]++;
        }
        for (int i = 1; i <= n; i++) {
    if (incoming[i] == n - 1 && outcoming[i] == 0) {
        return i; 
    }
}
return -1;
    }
}