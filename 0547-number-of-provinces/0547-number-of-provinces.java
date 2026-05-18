class Solution {

    Set<Integer> visited;

    public void dfs(int node, int[][] isConnected) {

        visited.add(node);

        for (int nei = 0; nei < isConnected.length; nei++) {

            if (isConnected[node][nei] == 1 &&
                !visited.contains(nei)) {

                dfs(nei, isConnected);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        visited = new HashSet<>();

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (!visited.contains(i)) {

                count++;

                dfs(i, isConnected);
            }
        }

        return count;
    }
}