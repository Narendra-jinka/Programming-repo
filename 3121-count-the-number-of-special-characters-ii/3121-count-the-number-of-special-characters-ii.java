class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                map.put(word.charAt(i),i);
            }
        }
       for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i)) && map.containsKey(Character.toLowerCase(word.charAt(i))) ){
                
                int index=map.get(Character.toLowerCase(word.charAt(i)));
                if(index<i){
                    count++;
                    map.remove(Character.toLowerCase(word.charAt(i)));
                }
                else{
                    map.remove(Character.toLowerCase(word.charAt(i)));
                }
            }
        }
        return count;
    }
}