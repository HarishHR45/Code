class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getnext(n);
        while(fast != 1 && slow != fast){
             slow = getnext(slow);
             fast = getnext(getnext(fast));
        }
        return fast == 1;
    }

    private int getnext(int a){
        int r = 0, res = 0;
        while(a != 0){
            r = a % 10;
            res = res + r*r;
            a = a / 10;
        }
        return res;
    }
}