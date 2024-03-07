import java.util.*;
class graph{


    private int V;
    ArrayList<ArrayList<Integer>> adj;
    graph(int v)
    {
        V=v;
        adj=new ArrayList<>(V);
        for (int i=0;i<V;i++)
            adj.add(new ArrayList<>());    
    }

void addEdge(int u,int w){adj.get(u).add(w);}
boolean isCyclic()
{
    boolean[] visited=new boolean[V];
    boolean[] restack=new boolean[V];
    for(int i=0;i<V;i++)
        if( isCyclicUtil(i,visited,restack))  return true;
    return false;
}
boolean isCyclicUtil(int i,boolean[] visited,boolean[] restack)
{
    if(restack[i])return true;
    if(visited[i])return false;
    restack[i]=true;
    visited[i]=true;
    List<Integer> child=adj.get(i);
    for(int s:child)
    {
        if(isCyclicUtil(s, visited, restack))
          return true;
    }
    restack[i]=false;
     return false;
}
}
class dcycledet{
    public static void main(String[] args) {
        graph graph = new graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
         
        
        if(graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't "
                                    + "contain cycle");
    }
}

