class Solution {
    public boolean isAnagram(String s, String t) {
HashMap<Character,Integer> smap = new HashMap<>();
HashMap<Character,Integer> tmap = new HashMap<>();
for(char st:s.toCharArray()){
    smap.put(st,smap.getOrDefault(st,0)+1);
}
for(char tt:t.toCharArray()){
    tmap.put(tt,tmap.getOrDefault(tt,0)+1);
}
if (smap.equals(tmap)) { 
    return true; 
}
return false;
    }
}
