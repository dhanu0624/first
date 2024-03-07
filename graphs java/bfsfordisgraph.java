import java.util.*;
class Graph{
    private int V;
   static HashMap <Integer,LinkedList<Integer>> hm=new HashMap<>(); 
   void addEdge(int a,int b)
   {
    if(hm.containsKey(a))
     {
        LinkedList<Integer> l=hm.get(a);
         l.add(b);
         hm.put(a,l);  
     }
    else
    {
      LinkedList <Integer> l=new LinkedList<>();
       l.add(b);
       hm.put(a,l);  
    }
   
   }
   void bfs(int v)
   {
    ArrayList<Boolean> visited=new ArrayList<>(V);
    for(int i=0;i<V;i++)
      visited.set(v,false);
    for(int i=0;i<V;i++)
    {
      if(!visited.get(i))
      {
         bfshelp(v,visited,);
      }

    }
   }
   void bfshelp(int s,ArrayList<Boolean> visited)
   {
     
   }
}
public class bfsfordisgraph {

}
    
