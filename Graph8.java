import java.util.*;

public class Graph8 {

    static class Edge {

        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        
        graph[1].add(new Edge(1, 2, -4));
       

        
        graph[2].add(new Edge(2, 3, 2));
        
       
        graph[3].add(new Edge(3, 4, 4));
        
        graph[4].add(new Edge(4, 1, -1));
        
        

    }


    public static void bellmanFord(ArrayList<Edge> graph[],int src){
        int dist[] = new int[graph.length];
        for(int i=0; i<dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        } 

        // algo
        int V = graph.length;

        for(int i=0; i<V-1; i++){
            for(int j=0; j<graph.length; j++){
                for(int k = 0; k<graph[j].size(); k++){
                    Edge e= graph[j].get(k);
                    int u= e.src;
                    int v= e.dest;
                    int wt = e.wt;
                    if(dist[u] != Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }
        // print
        for(int i=0; i<dist.length; i++){
            System.err.print(dist[i]+" ");
        }
        System.err.println();
    }
    public static void main(String arg[]) {

        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        bellmanFord(graph, 0);
        
    }

}