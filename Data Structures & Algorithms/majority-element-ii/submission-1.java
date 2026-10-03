class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        int major = n / 3;

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > major) {
                answer.add(entry.getKey());
            }
        }

        return answer;
    }
}