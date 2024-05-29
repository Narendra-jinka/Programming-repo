/*import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        int count=0;
        BigInteger num=new BigInteger(s,2);
        while(!num.equals(BigInteger.ONE)){
            if(num.mod(BigInteger.TWO).equals(BigInteger.ZERO)){
                num=num.divide(BigInteger.TWO);
                
            }
            else{
                num=num.add(BigInteger.ONE);
            }
            count++;
        }
        return count;
    }
}*/

class Solution {
    public int numSteps(String s) {
        int cnt = 0;
        int cary = 0;

        for(int i = s.length()-1; i >= 1; i--){
            int num = s.charAt(i) -'0';
            if(num == 0 && cary == 0){
                cnt++;
            }else if(num == 1 && cary == 1){
                cnt++;
                cary = 1;
            }else{
                cnt += 2;
                cary = 1;
            }
        }
        if(cary == 1)cnt++;
        return cnt;
    }
}