class Solution {
    public int minOperations(String s) {
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Check what the character should be if the string started with '0'
            // Even indices should be '0', odd indices should be '1'
            if (i % 2 == 0) {
                if (s.charAt(i) == '1') count++;
            } else {
                if (s.charAt(i) == '0') count++;
            }
        }
        
        // Return the minimum between this count, and the count for the other pattern
        return Math.min(count, s.length() - count);
    }
}