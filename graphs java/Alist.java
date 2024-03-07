import java.util.ArrayList;

class Alist{
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
   static void printgraph(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i=0;i<adj.size();i++)
        {
            System.out.println("\nAdjacency list of vertex" + i);
            System.out.print("Head :");
           for(int it:adj.get(i)){
            System.out.print(it+" ");
           }
           System.out.println(); 
        }
    }
  public static void main(String[] args) {
         int v=5;
         ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>(5);
         for (int i=0;i<v;i++) {
            al.add(new ArrayList<Integer>());
         }
         addEdge(al,0,1);
         addEdge(al,0,4);
         addEdge(al, 1, 2);
         addEdge(al, 1, 3);
         addEdge(al, 1, 4);
         addEdge(al, 2, 3);
         addEdge(al, 3, 4);
         printgraph(al);
    }
}