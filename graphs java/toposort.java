import java.util.*;
class Graph{
     private int V;
     private ArrayList<ArrayList<Integer>> adj;
        Graph(int v){
        V=v;
        adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++){
          adj.add(new ArrayList<Integer>());
        }
     }
     void addEdge(int u,int v){adj.get(u).add(v);}
     void tsort(){
        boolean[] vis=new boolean[V];
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                tutil(i,vis,st);
            }
        }
        while(!st.isEmpty()){
       System.out.print(st.pop()+" ");
        }
     }
     void tutil(int s,boolean[] vis,Stack<Integer> st){
           vis[s]=true;
           for(int it:adj.get(s)){
            if(!vis[it]){
                tutil(it, vis, st);
            }
           }
         //  Iterator <Integer> it=adj.get(s).iterator();
          // while(it.hasNext()){
            //int i=it.next();
            //if(!vis[i]){
              //  tutil()
            //}
           
           st.push(s);

     }
}
class toposort{
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
 
        System.out.println("Following is a Topological "
                           + "sort of the given graph");
        // Function Call
        g.tsort();

    }
}