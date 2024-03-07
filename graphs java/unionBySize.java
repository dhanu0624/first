
class disjointsets{
    int[] par;
    int[] size;
    disjointsets(int n){
          par=new int[n+1];
          size=new int[n+1];
        for(int i=0;i<=n;i++){
            par[i]=i;
            size[i]=1;
        }
    }
    int findUPar(int i){
        if(par[i]==i)return i;
        par[i]=findUPar(par[i]);
        return par[i];
    }
    void union(int u,int v){
        int a=findUPar(u);
        int b=findUPar(v);
        if(a==b)return;
        if(size[a]>size[b]){
            par[b]=a;
            size[a]+=size[b];
        }
        else {
            par[a]=b;
            size[b]+=size[a];
        }
    }
}

public class unionBySize {
    public static void main(String[] args) {
        disjointsets ds=new disjointsets(7);
     
        ds.union(1, 2);
        ds.union(2, 3);
        ds.union(4, 5);
        ds.union(6, 7);
        ds.union(5, 6);
         if (ds.findUPar(3) == ds.findUPar(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");

        ds.union(3, 7);
        if (ds.findUPar(3) == ds.findUPar(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");
    }
}
