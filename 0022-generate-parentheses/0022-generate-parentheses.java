class Solution {
    private void generateParenthesisRecursive(List<String> result, String current, int openCount, int closeCount, int n) {
        // Base case: When we have used all pairs of parentheses
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // If we can add an open parenthesis, do it
        if (openCount < n) {
            generateParenthesisRecursive(result, current + "(", openCount + 1, closeCount, n);
        }

        // If we can add a close parenthesis without breaking the rules, do it
        if (closeCount < openCount) {
            generateParenthesisRecursive(result, current + ")", openCount, closeCount + 1, n);
        }
    }


    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisRecursive(result, "", 0, 0, n);
        return result;
    }
}