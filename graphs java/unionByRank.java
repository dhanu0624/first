import java.util.ArrayList;

 class disjointsets {
    ArrayList<Integer> rank=new ArrayList<>();
    ArrayList<Integer> par=new ArrayList<>();
    disjointsets(int n){
        for(int i=0;i<=n;i++){
            rank.add(0);
            par.add(i);
        }
    }
    int findUPar(int i){
        if(par.get(i)==i)return i;
        else{
            par.set(i,findUPar(par.get(i)));
            return par.get(i);
        }
        
    }
    void unionByRank(int u,int v){
        int up_u=findUPar(u);
        int up_v=findUPar(v);
        if(up_u==up_v)return;
        else if(rank.get(up_u)>rank.get(up_v)){
               par.set(up_v,up_u);
        }
        else if(rank.get(u)<rank.get(v)){
            par.set(u,v);
        }
        else{
            par.set(u,v);
            rank.set(v,rank.get(v)+1);
        }

    }
}
class unionByRank{
    public static void main(String[] args) {
        disjointsets ds=new disjointsets(7);
     
        ds.unionByRank(1, 2);
        ds.unionByRank(2, 3);
        ds.unionByRank(4, 5);
        ds.unionByRank(6, 7);
        ds.unionByRank(5, 6);
         if (ds.findUPar(3) == ds.findUPar(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");

        ds.unionByRank(3, 7);
        if (ds.findUPar(3) == ds.findUPar(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");
    }
}