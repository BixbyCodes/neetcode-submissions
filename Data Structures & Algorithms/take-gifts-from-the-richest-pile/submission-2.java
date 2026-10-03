class Solution {
    public long pickGifts(int[] gifts, int k) {

//       gifts =   Array.sort(gifts);
//         for(int i =gifts.length-1;i>0;i--){
//             while(k>=0){
// int a = Math.sqrt(gifts[i]);
// gifts[i] = a;
//             }
//              Array.sort(gifts);
//         }
//     long sum = 0;
//         for(int gift:gifts){
//             sum = sum + gift;
//         }
//         return sum ;
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
for (int gift : gifts) {
            maxHeap.add(gift);
        }
   for (int i = 0; i < k; i++) {
            int max = maxHeap.poll();
            int reduced = (int) Math.sqrt(max);
            maxHeap.add(reduced);
        }
        long sum = 0;
        for (int gift : maxHeap) {
            sum += gift;
        }
        return sum;
    }
}