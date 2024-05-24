/*class Solution {
    int n;
    int maxi=0;
    private void solve(String[] words,int[] score,int indx,int currscore,int[] freq){
        if(indx==n){
            maxi=Math.max(maxi,currscore);
            return;
        }
        int tempFreq[]=Arrays.copyOf(freq,freq.length);
        int tempScore=0;
        int j=0;
        while(j<words[indx].length()){
            char ch=words[indx].charAt(j);
            tempFreq[ch-'a']--;
            tempScore+=score[ch-'a'];
            if(tempFreq[ch-'a']<0){
                break;
            }
            j++;
        }
        //take 
        if(j==words[indx].length())
        solve(words,score,indx+1,currscore+tempScore,tempFreq);
        
        //not-take
        solve(words,score,indx+1,currscore,freq);
    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
       n=words.length;
      int freq[]=new int[26];
       for(char ch:letters){
        freq[ch-'a']++;
       } 
       solve(words,score,0,0,freq);
       return maxi;
    }
}*/

class Solution {
	public int maxScoreWords(String[] arr, char[] letters, int[] score) {
		int[] freq = new int[26];
		for (int i = 0; i < letters.length; i++) {
			freq[letters[i] - 'a']++;
		}

		int ans = helper(arr, freq, score, 0);
		return ans;
	}

	public int helper(String[] arr, int[] temp, int[] score, int index) {
		if (index == arr.length) {
			return 0;
		}
		int ans1 = helper(arr, temp, score, index + 1);
		int ans2 = 0;
		boolean flag = true;
		int maximumScore = 0;
		for (int i = 0; i < arr[index].length(); i++) {
			char ch = arr[index].charAt(i);
			if (temp[ch - 'a'] <= 0) {
				flag = false;
			}
			temp[ch - 'a']--;
			maximumScore += score[ch - 'a'];
		}

		if (flag) {
			ans2 = maximumScore + helper(arr, temp, score, index + 1);
		}
		int n = arr[index].length();
		for (int i = 0; i < n; i++) {
			char ch = arr[index].charAt(i);
			temp[ch - 'a']++;
		}
		return Math.max(ans1, ans2);
	}
}