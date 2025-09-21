class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        Arrays.sort(freq);  
        int deletions = 0;
        int maxAllowed = s.length();  

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break;
            if (freq[i] > maxAllowed) {
                deletions += freq[i] - maxAllowed;
                freq[i] = maxAllowed;
            }
            maxAllowed = Math.max(0, freq[i] - 1); 
        }

        return deletions;
    } 
}