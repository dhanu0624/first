import java.util.*;
class colordcycledet{
      static int WHITE=0,GREY=1,BLACK=2;

 static class Graph{
      int V;
     LinkedList<Integer>[] adj;
    @SuppressWarnings("unchecked") Graph(int v){
        V=v;
        adj=new LinkedList[V];
        for(int i=0;i<V;i++)
            adj[i]=new LinkedList<>();
     }
    }
    static void addEdge(Graph g,int u,int v){g.adj[u].add(v);}
    static boolean isCyclic(Graph g){
        int[] color=new int[g.V];
        for(int i=0;i<g.V;i++) color[i]=WHITE;
        for(int i=0;i<g.V;i++)  if(color[i]==WHITE&&dfsUtil(g,i,color)) return true;
       return false; 
     }
    static boolean dfsUtil(Graph g,int s,int[] color){
        color[s]=GREY;
        for(int n:g.adj[s]){
            if(color[n]==GREY)return true;
            if(color[n]==WHITE && dfsUtil(g,n, color))return true;
        }
        color[s]=BLACK;
        return false;
     }



    public static  void main(String[] args) {
         Graph g = new Graph(6);
            addEdge(g, 5, 3);
            addEdge(g, 3, 1);
            addEdge( g,1, 2);
            addEdge(g, 2, 4);
            addEdge(g, 4, 0);
            
            if (isCyclic(g))
                System.out.println("Graph contains cycle");
            else
                System.out.println("Graph doesn't contain cycle");
    }
}

