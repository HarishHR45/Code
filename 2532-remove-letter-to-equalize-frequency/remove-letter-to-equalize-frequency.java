class Solution {
    public boolean equalFrequency(String word) {
        int freq[] = new int[26];
        for(char c : word.toCharArray()){
            freq[c - 'a']++;
        }

        for(int i = 0;i<freq.length;i++){
            if(freq[i] == 0) continue;
            freq[i]--;
            if(isequal(freq)){
                return true;
            }
            freq[i]++;
        }
        return false;
    }

    public boolean isequal(int[] freq){
        int val = 0;
        for(int f : freq){
            if(f == 0) continue;
            if(val == 0){
                val = f;
            }
            if(val != f) return false;
        }
        return true;
    }
}