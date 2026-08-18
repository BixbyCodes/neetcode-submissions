class Solution {
    
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        
        for (String s : strs) {
            // Append the length of the string, a '#' delimiter, and the string itself
            encodedString.append(s.length()).append('#').append(s);
        }
        
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            // Find the next '#' delimiter starting from our current index 'i'
            int delimiterIndex = str.indexOf('#', i);
            
            // Extract the length of the upcoming string
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            
            // Extract the actual string using the length we just found
            String currentString = str.substring(delimiterIndex + 1, delimiterIndex + 1 + length);
            decodedStrings.add(currentString);
            
            // Move the pointer 'i' past the string we just read to find the next one
            i = delimiterIndex + 1 + length;
        }
        
        return decodedStrings;
    }
}