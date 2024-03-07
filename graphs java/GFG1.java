//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG1 {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        long sn=(n*(n+1))/2;
        long s2n=(n*(n+1)*(2*n+1))/6;
        int ans[]=new int[2];
        long s=0,s2=0;
        for(int i:arr){
            s+=(long)i;
            s2+=(long)i*(long)i;
        }
        long x=s-sn;
        long y=(s2-s2n)/x;
        long m=(x+y)/2;
        long l=y-m;
        ans[0]=(int)m;
        ans[1]=(int)l;
        return ans;
    }
}
