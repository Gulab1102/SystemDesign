package org.graph;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int V;

    private LinkedList<Integer> adj[];

    Graph(int V){
        this.V=V;
        adj=new LinkedList[V];

        for(int i=0;i<V;i++){
            adj[i]=new LinkedList<>();
        }
    }

    void addEdge(int u,int v){
        adj[u].add(v);
    }

    void bfs(int s){
        boolean[] visited= new boolean[V];

        Queue<Integer> queue=new LinkedList<>();

        visited[s]=true;

        queue.add(s);

        while(!queue.isEmpty()){
            int x=queue.peek();
            queue.remove();

            System.out.print(x+" ");

            for(int j : adj[x]){
                if(!visited[j]){
                    visited[j]=true;
                    queue.add(j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.bfs(2);
    }

}
