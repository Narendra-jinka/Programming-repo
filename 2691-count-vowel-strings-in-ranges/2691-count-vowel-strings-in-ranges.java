class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int res[] = new int[queries.length];
        
        int[] prefix = new int[words.length];
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("e");
        set.add("i");
        set.add("o");
        set.add("u");

        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(i==0){
                if(set.contains(""+s.charAt(0))&& set.contains(""+s.charAt(s.length()-1))){
                    prefix[i]=1;
                }
                else{
                    prefix[i]=0;
                }
                
            }
            else{
                if(set.contains(""+s.charAt(0))&& set.contains(""+s.charAt(s.length()-1))){
                    prefix[i]=1+prefix[i-1];
                }
                else{
                    prefix[i]=prefix[i-1];
                }
            }
        }
        // for(int i=0;i<prefix.length;i++){
        //     System.out.print(prefix[i]+" ");
        // }
        int k=0;
        for(int[] a:queries){
            int s=a[0];
            int e=a[1];
            int count=0;
            res[k]= prefix[e] - (s!=0 ? prefix[s-1]:0);
            k++;
        }

        return res;




        // for(int a[]:queries){
        //     int s=a[0];
        //     int e=a[1];
        //     int count=0;
        //     for(int i=s;i<=e;i++){
        //         int x=0;
        //         if(words[i].startsWith("a")|| words[i].startsWith("e")|| words[i].startsWith("i")|| words[i].startsWith("o")|| words[i].startsWith("u")){
        //             x++;
        //         }
        //         if(words[i].endsWith("a")||words[i].endsWith("e")|| words[i].endsWith("i")|| words[i].endsWith("o")|| words[i].endsWith("u")){
        //             x++;
        //         }
        //         if(x==2) count++;
        //     }
        //         res[k++]=count;
        // }

        // return res;
    }
}