// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
class first{
    public static void main(String args[])throws IOException{
        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // int t=Integer.parseInt(br.readLine().trim());
        // while(t-->0){
        //     String s[]=br.readLine().trim().split(" ");
        //     int n=Integer.parseInt(s[0]);
        //     int k=Integer.parseInt(s[1]);
        //     int[] arr=new int[n];
        //     s=br.readLine().trim().split(" ");
        //     for(int i=0;i<n;i++){
        //         arr[i]=Integer.parseInt(s[i]);
        //     }
        //     Solution sol=new Solution();
            
        //     System.out.println("Answer is" +sol.find(n,k,arr));
        // }
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("answer is"+ new Solution().find(n,k,arr));
        }
        
    }
}
class Solution{
    static int find(int n,int k,int arr[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
            if(hm.get(i)==k)return i;
        }
        return -1;
    } 
}