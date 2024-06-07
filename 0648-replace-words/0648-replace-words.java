class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        
        
        String[] str=sentence.split(" ");
        for(String root:dict){
            int rootlen=root.length();
            for(int i=0;i<str.length;i++) {
                if(str[i].length() >= rootlen){
                     String subroot = str[i].substring(0,rootlen);
                     if(subroot.equals(root)){
                         str[i]=root;
                     }
                }
            }
        }
        
        StringBuilder sb=new StringBuilder();
        for(String s:str){
            sb.append(s+" ");
        }
        return sb.toString().strip();
    }
}