class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> smap= new HashMap<>();
         HashMap<Character,Integer> tmap= new HashMap<>();
         for(char sh:s.toCharArray()){
            smap.put(sh,smap.getOrDefault(sh,0)+1);
         }
          for(char th:t.toCharArray()){
            tmap.put(th,tmap.getOrDefault(th,0)+1);
         }
        return smap.equals(tmap);

    }
}
