import java.util.LinkedList;
import java.util.Iterator;


 class dgraph{
        private int V;
        private LinkedList<Integer> adj[];
        dgraph(int v)
        {
            V=v;
            adj=new LinkedList[v];
            for(int i=0;i<v;i++)
             adj[i]=new LinkedList();
        } 
    
     void addedge(int m,int n){adj[m].add(n);}
     void bfstr(int v) {
        boolean visited[]=new boolean[V];
        LinkedList<Integer> ll=new LinkedList<Integer>();
        visited[v]=true;
        ll.add(v);
        while(ll.size()>0)
        {
           int s=ll.pop();
           System.out.print(s+" ");
           Iterator <Integer> i= adj[s].listIterator();
           while(i.hasNext())
           {
            int n=i.next();
            if (!visited[n])
            {
            visited[n]=true;
            ll.add(n);
            }
           }
      
        }
      }
      public static void main(String args[])
      {
        dgraph g = new dgraph(4);
		g.addedge(0, 1);
		g.addedge(0, 2);
		g.addedge(1, 2);
		g.addedge(2, 0);
		g.addedge(2, 3);
		g.addedge(3, 3);

        System.out.println(
			"Following is Breadth First Traversal "
			+ "(starting from vertex 2)");

		g.bfstr(2);
      }
      
 }
