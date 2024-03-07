import java.util.*;
class Graph{
      private int V;
      ArrayList<ArrayList<Integer>> adj;
     Graph(int v){
        V=v;
        adj=new ArrayList<>(V);
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }
      }
      void addEdge(int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(v);
      }
      boolean isCyclic(){
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
              if(isCyclicUtil(i,visited,-1))return true;
            }
        }
        return false;
      }
      boolean isCyclicUtil(int s,boolean visited[],int parent){
        visited[s]=true;
        Iterator<Integer> it=adj.get(s).iterator();
        while(it.hasNext()){
            int n=it.next();
            if(!visited[n] && isCyclicUtil(n, visited, s))  return true;
            else if(n!=parent)return true;
        }
        return false;
      }
    
}
public class udcycledet {
     public static void main(String[] args) {
        Graph g1 = new Graph(4);
        g1.addEdge(1, 2);
        //g1.addEdge(0, 2);
        g1.addEdge(2, 3);
       // g1.addEdge(0, 3);
        //g1.addEdge(3, 4);
        if (g1.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");
 
        Graph g2 = new Graph(3);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        if (g2.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");
    }
}
