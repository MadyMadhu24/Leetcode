class Solution {
    public int reverse(int x) {
        int rev=0;
        while (x!=0){
            int digit=x%10;

            //overflow
            //1. Max (+ve)
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && digit > 7))
            return 0;

            //2.Min (-ve)
            if (rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && digit < -8)
            return 0;

            rev = rev * 10 + digit;
            x = x/10;

        }
        return rev;
    }
}