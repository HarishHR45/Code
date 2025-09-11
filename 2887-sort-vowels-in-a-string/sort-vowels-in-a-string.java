class Solution {

    public boolean isvowel(char c){
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }

    public String sortVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
            list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        StringBuilder res = new StringBuilder();
        int j= 0;
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                res.append(list.get(j));
                j++;
            }
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}