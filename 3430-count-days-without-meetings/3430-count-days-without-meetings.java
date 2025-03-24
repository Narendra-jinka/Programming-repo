import java.util.Arrays;

class Solution {
    public int countDays(int days, int[][] meetings) {
        
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        // Merge overlapping intervals
        int[] currentMeeting = meetings[0];
        int ans = 0;

        for (int i = 1; i < meetings.length; i++) {
            if (meetings[i][0] <= currentMeeting[1]) {
                // Overlapping intervals, merge them
                currentMeeting[1] = Math.max(currentMeeting[1], meetings[i][1]);
            } else {
                // Count the free days between currentMeeting and the next meeting
                ans += meetings[i][0] - currentMeeting[1] - 1;
                // Move to the next meeting
                currentMeeting = meetings[i];
            }
        }

        // Count the free days before the first meeting
        if (meetings[0][0] > 1) {
            ans += meetings[0][0] - 1;
        }

        // Count the free days after the last meeting
        if (currentMeeting[1] < days) {
            ans += days - currentMeeting[1];
        }

        return ans;
    }
}