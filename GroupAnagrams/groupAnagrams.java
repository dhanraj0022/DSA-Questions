class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Hashmap stores the string and corresponding list of strings
        Map<String, List<String>> map = new HashMap<>();

        // Iterating each string in word
        for(String word: strs) {
            // Converting each word to character and storing in character array
            char[] chars = word.toCharArray();
            // Sorting the character array
            Arrays.sort(chars);
            // Sorted array gets converted to a string and stored in sortedWord
            String sortedWord = new String(chars);
            // If the hashmap doesn't contain the string it is unique
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            // For non unique keys we store other words in the values section of map
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}