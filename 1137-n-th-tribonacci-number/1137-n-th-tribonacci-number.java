class Solution {
    //0 1 1 2 4 
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int a=0,b=1,c=1;
        int k=n-2;
        int d=0;
        while(k>0){
            d=a+b+c;
            a=b;
            b=c;c=d;
            k--;
        }
        return d;
        
    }
}