class Solution {
    private void solveRec(String s, int idx, Set<String> wordDict, List<String> res, StringBuilder ans){
        //Base Case
        if(idx == s.length()){
            res.add(ans.toString().trim());
            return;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=idx; i<s.length(); i++){
            sb.append(s.charAt(i));

            //Backtracking and Recursion
            if(wordDict.contains(sb.toString())){
                ans.append(sb + " "); // --->Forward...
                solveRec(s, i+1, wordDict, res, ans); // --->Recursion....
                ans.delete(ans.length()-sb.length()-1, ans.length()); // --->Backward.. 
            }
        }
    }



    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        solveRec(s, 0, new HashSet<>(wordDict), res, new StringBuilder());

        return res;
    }
}