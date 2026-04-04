class Solution {
    public boolean dfs(int[][] graph, int start, int[] visited, int[] pathVisited, List<Integer> ans){

        visited[start] = 1;
        pathVisited[start] = 1;
        
        for(int neighbour : graph[start]){
            if(visited[neighbour] == 0){
                if(dfs(graph, neighbour, visited, pathVisited, ans)) return true;
            }
            else if(pathVisited[neighbour] == 1) return true; 
        }
        ans.add(start);
        pathVisited[start] = 0;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] visited = new int[n];
        int[] pathVisited = new int[n];
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(visited[i] == 0){
                dfs(graph, i, visited, pathVisited, ans);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}