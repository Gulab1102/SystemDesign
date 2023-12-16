package org.example;


import java.util.HashSet;
import java.util.Set;

public class Main {

    static boolean findString(String str , int start, int end){

        boolean[] visited=new boolean[256];

        for(int i=start;i<=end;i++){
            if(visited[str.charAt(i)]==true)return false;

            visited[str.charAt(i)]=true;
        }


        return true;

    }

    static int maxLen(String str){
        int n=str.length();
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            boolean[] visit=new boolean[256];

            for(int j=i;j<n;j++){
              if(visit[str.charAt(j)]==true)break;
              else{
                  ans=Math.max(ans,j-i+1);
                  visit[str.charAt(j)]=true;
              }
            }
        }




        return ans;
    }


    public static void main(String[] args) {

        System.out.println(maxLen("ABCDEFGABEF"));

    }
}