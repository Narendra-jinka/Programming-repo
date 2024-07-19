class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
    List<Integer> res = new ArrayList<>();

    // Iterate through each row of the matrix
    for (int i = 0; i < matrix.length; i++) {
        int rowMin = matrix[i][0]; // Initialize the minimum element of the row
        int colIndex = 0; // To keep track of the column index of the minimum element

        // Finding the smallest element in the ith row
        for (int j = 1; j < matrix[i].length; j++) {
            if (matrix[i][j] < rowMin) {
                rowMin = matrix[i][j];
                colIndex = j; // Update column index
            }
        }

        // Checking if rowMin is also the largest element in its column
        boolean isLuckyNumber = true; // Flag to check if it's a lucky number
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[j][colIndex] > rowMin) {
                isLuckyNumber = false; // Not a lucky number
                break;
            }
        }

        // If it's a lucky number, add it to the result list
        if (isLuckyNumber) {
            res.add(rowMin);
        }
    }

    return res; // Return the list of lucky numbers
}
}