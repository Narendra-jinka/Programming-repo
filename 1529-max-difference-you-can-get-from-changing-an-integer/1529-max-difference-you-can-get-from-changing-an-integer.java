class Solution {
    public int maxDiff(int num) {
        String str = Integer.toString(num);
        StringBuilder maxStr = new StringBuilder(str);
        StringBuilder minStr = new StringBuilder(str);
        char maxDigit = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '9') {
                maxDigit = str.charAt(i);
                break;
            }
        }

        if (maxDigit != ' ') {
            for (int i = 0; i < maxStr.length(); i++) {
                if (maxStr.charAt(i) == maxDigit) {
                    maxStr.setCharAt(i, '9');
                }
            }
        }

        
        if(str.charAt(0)=='1'){
            char x='0';
            for(int i=1;i<str.length();i++){
                char k=str.charAt(i);
                if(k!='0'&&k!='1'){
                    if(x==k){
                        minStr.setCharAt(i,'0');
                    }
                    else{
                        if(x=='0'){
                            x=k;
                            minStr.setCharAt(i,'0');
                        }
                    }
                }
            }
            
        }
        else{
           char x=  str.charAt(0);
           for(int i=0;i<str.length();i++){
                if(str.charAt(i)==x){
                    minStr.setCharAt(i,'1');
                }
           }   
        }
        
        int maxVal = Integer.parseInt(maxStr.toString());
        int minVal = Integer.parseInt(minStr.toString());
        //System.out.println("MIN "+ minVal);
        //System.out.println("MAX "+maxVal);
        return maxVal - minVal;
    }
}