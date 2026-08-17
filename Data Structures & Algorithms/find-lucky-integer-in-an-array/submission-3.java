class Solution {
    public int findLucky(int[] arr) {
       int max = -1;
        int cmax = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           
               int key = entry.getKey();
            int value = entry.getValue();
            if(key==value){
               cmax=value;
                if(cmax>max){
                    max = cmax;
                }
            }
        }
        return max;
    }
}