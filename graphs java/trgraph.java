
import java.util.*;
import java.lang.*;
import java.io.*;
  @SuppressWarnings("unchecked") public class trgraph {
    private static int vert=5;
    private static ArrayList<Integer>[] adj=new ArrayList[vert]; 
    private static ArrayList<Integer>[] tr=new ArrayList[vert]; 
    void addedge(int u,int v,boolean ch)
    {
        if(!ch)
           adj[u].add(v);
        else 
          tr[u].add(v);
    }
    void gettr()
    {
        for(int i=0;i<vert;i++)
        {
            for(int j=0;j<adj[i].size();j++)
            {
                addedge(adj[i].get(j),i,true);
            }
        }
    }
    void printgraph()
    {
        for(int i=0;i<vert;i++)
        {
            System.out.print(i+"->");
            for(int j=0;j<adj[i].size();j++)
            {
                System.out.print(adj[i].get(j)+" ");
            }
            System.out.println();
        }
    }
     public static void main(String[] args) throws java.lang.Exception {
        trgraph trg=new trgraph();
        for(int i=0;i<trg.vert;i++)
        {
            adj[i]=new ArrayList<Integer>();
            tr[i]= new ArrayList<Integer>();
        }
        trg.addedge(0, 1, false);
       trg. addedge(0, 4, false);
       trg. addedge(0, 3, false);
        trg.addedge(2, 0, false);
        trg.addedge(3, 2, false);
        trg.addedge(4, 1, false);
       trg. addedge(4, 3, false);
       trg.gettr();
       trg.printgraph();  
     } 
}
