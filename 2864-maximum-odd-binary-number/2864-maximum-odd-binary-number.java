class Solution {
    public String maximumOddBinaryNumber(String s) {
        int z=0;
        int o=0;
        
        for(char c:s.toCharArray()){
            if(c=='0'){
                z++;
            }
            else{
                o++;
            }
        }
        StringBuilder sb=new StringBuilder();
        while(o-1 > 0){
            sb.append("1");
            o--;
        }
        while(z>0){
            sb.append("0");
            z--;
        }
        sb.append("1");
        return sb.toString();
    }
}