class Solution {
    public boolean check(int[][] graph, int i, int[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = 0;
        while(!q.isEmpty()){
            int size = q.size();
            int start = q.poll();
            for(int j : graph[start]){
                if(visited[j] == -1){
                    q.add(j);
                    visited[j] = visited[start] == 0 ? 1 : 0;
                }
                else if(visited[j] == visited[start]) return false;
                
            }
        }
        return true;

    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] visited = new int[n];
        for(int i = 0; i < n; i++){
            visited[i] = -1;
        }

        for(int i = 0; i < n; i++){
            if(visited[i] == -1){
                if(check(graph, i, visited) == false){
                    return false;
                }
            }
        }
        return true;
    }
}