class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;
        
        // Loop through each element in the array to count valid teams with the current element as the middle one
        for (int j = 0; j < n; j++) {
            int lessLeft = 0, lessRight = 0, greaterLeft = 0, greaterRight = 0;
            
            // Count elements less than and greater than rating[j] to the left
            for (int i = 0; i < j; i++) {
                if (rating[i] < rating[j]) lessLeft++;
                if (rating[i] > rating[j]) greaterLeft++;
            }
            
            // Count elements less than and greater than rating[j] to the right
            for (int k = j + 1; k < n; k++) {
                if (rating[k] < rating[j]) lessRight++;
                if (rating[k] > rating[j]) greaterRight++;
            }
            
            // Add the number of valid teams
            count += lessLeft * greaterRight + greaterLeft * lessRight;
        }
        
        return count;
    }
}