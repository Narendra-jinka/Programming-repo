class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        
       /* 
       
       <---- BRUTE FORCE APPORACH -------->
       
       
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
        return sb.toString().strip();*/
        
        
        Set<String> rootSet = new HashSet<>(dict);
        
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Iterate over each word in the sentence
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // Try to replace the word with its root
            for (int j = 1; j <= word.length(); j++) {
                String prefix = word.substring(0, j);
                if (rootSet.contains(prefix)) {
                    words[i] = prefix;
                    break;
                }
            }
        }
        
        // Join the words back into a sentence
        return String.join(" ", words);
    }
}