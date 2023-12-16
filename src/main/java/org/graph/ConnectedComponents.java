package org.graph;

import java.util.ArrayList;

public class ConnectedComponents {

    static class Graph{

        int V;

        ArrayList<ArrayList<Integer>> adj;

        Graph(int V){
            this.V=V;
            adj=new ArrayList<>();
            for(int i=0;i<V;i++){
                adj.add(i,new ArrayList<>());
            }
        }

        void addedge(int u,int v){
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        void Dfs(boolean[] visit,int src){
            visit[src]=true;
            System.out.print(src+" ");

            for(int x: adj.get(src)){
                if(!visit[x]){
                    Dfs(visit,x);
                }
            }

        }

        void find(){

            boolean[] visit=new boolean[this.V];

            int ans=0;

            for(int i=0;i<V;i++){
                if(visit[i]!=true){
                    Dfs(visit,i);
                    System.out.println();
                }


            }

        }

    }

    public static void main(String[] args) {

        Graph g=new Graph(5);
        g.addedge(1, 0);
        g.addedge(2, 1);
        g.addedge(3, 4);

        g.find();

    }
}
