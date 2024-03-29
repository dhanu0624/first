import java.util.*;
import java.lang.*;
import java.io.*;

class ssspath{
    
    public static void main(String[] args) throws IOException{
        int n=9, m=10;
        int[][] edge = {{0,1},{0,3},{3,4},{4,5},{5,6},{1,2},{2,6},{6,7},{7,8},{6,8}};
          
        Solution obj = new Solution();
        int res[] = obj.shortestPath(edge,n,m,0);
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }

}
class Solution{
    int[] shortestPath(int[][] edge,int V,int E,int s ){
            int[] dist=new int[V];
            for(int i=0;i<V;i++)dist[i]=(int)1e9;
            dist[0]=0;
            ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
            for(int i=0;i<V;i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i=0;i<E;i++){
                adj.get(edge[i][0]).add(edge[i][1]);
                adj.get(edge[i][1]).add(edge[i][0]);
            }
            Queue <Integer> q=new LinkedList<>();
            q.add(s);
            while(!q.isEmpty()){
                int v=q.poll();
                for(int it:adj.get(v)){
                    if(dist[v]+1<dist[it]){
                        dist[it]=dist[v]+1;
                        q.add(it);
                    }
                }
            }
            for(int i = 0;i<V;i++) {
            if(dist[i] == 1e9) {
                dist[i] = -1; 
            }
        }
         return dist;
    }
}
