class Solution {
    public boolean backspaceCompare(String s, String t) {
       int i = s.length()-1,j=t.length()-1;
       int skips = 0,skipt = 0;
       while(i >=0 || j>=0){
        while(i>=0 && (skips > 0 || s.charAt(i) == '#')){
            if(s.charAt(i)=='#'){
                skips++;
            }
            else{
                skips--;
            }
            i--;
        }
        while(j>=0 && (skipt > 0 || t.charAt(j) == '#')){
            if(t.charAt(j) == '#'){
                skipt++;
            }
            else{
                skipt--;
            }
            j--;
        }
        if(i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) return false;
        if((i >= 0) != ( j >= 0 )) return false;
        i--;
        j--;
       }
       return true;
    }
}