class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int temp=x;
        while(x>0){
            int dig=x%10;
            sum+=dig;
            x/=10;
        }
        return temp%sum==0?sum:-1;
    }
}