class Solution {
    public String findLatestTime(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (i == 0 && sb.charAt(i) == '?') {
                if (sb.charAt(i + 1) == '?' || sb.charAt(i + 1) == '1' || sb.charAt(i+1)=='0') {
                    sb.setCharAt(i, '1');
                } else {
                    sb.setCharAt(i, '0');
                }
            } else if (i == 1 && sb.charAt(i) == '?') {
                if (sb.charAt(i - 1) == '1') {
                    sb.setCharAt(i, '1');
                } else {
                    sb.setCharAt(i, '9');
                }
            } else if (i == 3 && sb.charAt(i) == '?') {
                sb.setCharAt(i, '5');
            } else if (i == 4 && sb.charAt(i) == '?') {
                sb.setCharAt(i, '9');
            }
        }
        return sb.toString();
    }
}
