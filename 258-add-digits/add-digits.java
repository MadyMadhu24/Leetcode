class Solution {
    public int addDigits(int num) {
        
        while (num >= 10){
            int sum=0;
            int temp=num;

            while (temp > 0){
                int digit= temp % 10;
                sum= sum + digit;
                temp= temp / 10;
            }
            num= sum;
        }
        return num;
    }
}