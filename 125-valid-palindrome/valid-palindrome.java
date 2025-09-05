class Solution {
    public boolean isPalindrome(String s) {
      String  str = s.toLowerCase().replaceAll("[^a-z0-9]","");
      int l = 0 , r = str.length()-1;
      while(l < r){
        char a = str.charAt(l);
        char b = str.charAt(r);

        if(a >= 'A' && a <= 'Z'){
            a = (char)(a+32);
        }
        if(b >= 'A' && b <= 'Z'){
            b = (char)(b+32);
        }

        if(!((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9'))){
            l++;
            continue;
        }
        if(!((b >= 'a' && b <= 'z') || (b >= '0' && b <= '9'))){
            r--;
            continue;
        }

        if(a != b){
            return false;
        }

        l++;
        r--;

      }
      return true;
    }
}