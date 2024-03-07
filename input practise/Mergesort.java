public class Mergesort {
    public static void main(String args[]){
        int arr[]={3,4,1,9,6,5,2,8,7};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void mergesort(int arr[],int low,int high){ 
        if(low>=high)return;
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int arr[],int low,int mid,int high){
        int i=low,j=mid+1;
        int k=0;
        int ans[]=new int[high-low+1]; 
        while(i<=mid && j<=high){
           if(arr[i]<=arr[j]) ans[k++]=arr[i++];
           else ans[k++]=arr[j++];
        }
        while(i<=mid)   ans[k++]=arr[i++]; 
        while(j<=high)   ans[k++]=arr[j++];
        for(int a=low;a<=high;a++)   arr[a]=ans[a-low];
        return;
    }
}
