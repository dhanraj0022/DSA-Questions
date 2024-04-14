// Generic solution using array and sort
class Solution {
    public boolean isAnagram(String s, String t) {
        // Converting string to character arrays
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        // Sorting the arrays
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        // If both array is equal it is an anagram
        return Arrays.equals(sChar, tChar);

    }
}