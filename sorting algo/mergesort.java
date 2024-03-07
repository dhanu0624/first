class mergesort{
    public static void main(String args[]){
        long[] a={2,4,1,3,5};
         System.out.println("before sorting");
        for(long i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        long c=mergest(a,0,a.length-1);
         System.out.println("after sorting");
        for(long i:a){
            System.out.print(i+" ");
        }
         System.out.println("count"+c);
    }
    static long mergest(long[] a,int low,int high){
        long c=0;
        if(low>=high)return c;
        int mid=(low+high)/2;
        c+=mergest(a, low,mid);
        c+=mergest(a, mid+1, high);
        c+=merge(a,low,mid,high);
        return c;
   }
   static long  merge(long[] a,int low,int mid,int high){
       long count=0;
       int i=low;
       long[] b=new long[a.length];
       int j=low;
       int k=mid+1;
       while(i<=mid && k<=high){
           if(a[i]>a[k]){
               b[j++]=a[k++];
               count+=(mid-i+1);
           }
           else{
               b[j++]=a[i++];
           }
       }
       while(i<=mid){
           b[j++]=a[i++];
       }
       while(k<=high){
           b[j++]=a[k++];
       }
       for(int m=low;m<=high;m++){
          a[m]=b[m];
       }
       return count;
   }
}