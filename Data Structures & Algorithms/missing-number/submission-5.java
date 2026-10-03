class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum= n * (n + 1) / 2;
        int suma= 0;
        
        for (int num : nums) {
           suma += num;
        }
        
        return sum - suma;
    }
}