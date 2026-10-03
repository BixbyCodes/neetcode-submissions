class Solution {
    public int arraySign(int[] nums) {
        int cm = 0;
        int co = 0;
        int cz = 0;
      
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                cz++;
            } else if (nums[i] < 0) {
                cm++;
            }
        }
      if(cz>0){
        return 0;
      }
      if(cm%2!=0){
        return -1;
      }
      return 1;
    }
}