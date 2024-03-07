
import java.util.*;
class Graph{
    private int V;
    private LinkedList<Integer>[] adj;
    Graph(int v)
    {
        V=v;
        adj=new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }
    void addedge(int u,int w){adj[u].add(w);}
    void dfs(int s)
    {
        boolean visited[] =new boolean[V];
        Stack <Integer> st=new Stack<>();
        st.push(s);
        while(!st.isEmpty())
        {
            s=st.pop();
            if(!visited[s])
            {
              System.out.print(s+" ");
              visited[s]=true;
            }
            Iterator<Integer> it=adj[s].iterator();
            while(it.hasNext())
            {
                int t=it.next();
                if(!visited[t])
                 st.push(t);
            }
        }
    }

}
class iterdfs{
    public static void main(String[] args) {
        Graph g=new Graph(5);
        g.addedge(1, 0);
        g.addedge(0, 2);
        g.addedge(2, 1);

        g.addedge(0, 3);
        g.addedge(1, 4);
             
        System.out.println("Following is the Depth First Traversal");
        g.dfs(0);
    }
}