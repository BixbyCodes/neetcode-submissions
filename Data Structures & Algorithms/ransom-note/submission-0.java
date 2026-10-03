class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mapr = new HashMap<>();
        HashMap<Character,Integer> mapm = new HashMap<>();
        for(char ch :ransomNote.toCharArray()){
            mapr.put(ch,mapr.getOrDefault(ch,0)+1);
        }
         for(char ch :magazine.toCharArray()){
            mapm.put(ch,mapm.getOrDefault(ch,0)+1);
        }
        for (char ch : mapr.keySet()) {
            if (mapm.getOrDefault(ch, 0) < mapr.get(ch)) {
                return false;
            }
        }

        return true;
    }
}