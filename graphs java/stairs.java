import java.util.*;
public class stairs {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        for(int i=1;i<=n;i++){
            n=n-i;
             k++;
            if(n<0)break;
           
        }
        System.out.println(k);
    }
}
