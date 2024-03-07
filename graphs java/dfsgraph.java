
import java.util.*;
public class dfsgraph {
    private int V;
    private LinkedList <Integer> adj[];
    dfsgraph(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
          adj[i]=new LinkedList();
        }
    }
    void addEdge(int v,int u){adj[v].add(u);}
    void dfsutil(int v,boolean visited[])
    {
        visited[v]=true;
        System.out.print(v+" ");
       for(int it:adj[v]){
        if(!visited[it]){
            dfsutil(it, visited);
        }
       }
    }
    void dfs(int v)
    {
        boolean visited[]=new boolean[V];
        dfsutil(v, visited);
    }
    public static void main(String[] args) {
        dfsgraph g=new dfsgraph(4);
        
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println(
            "Following is Depth First Traversal "
            + "(starting from vertex 2)");
 
        // Function call
        g.dfs(2);
    }
}
