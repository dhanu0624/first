
import java.util.*;
class ListNode{
    int data;
    ListNode next;
    ListNode(int a){
        data=a;
        next=null;
    }
}
class sortll{
     
    static void printll(ListNode head){
        if(head==null)return;
        ListNode temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"=> ");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }
     public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int t=sc.nextInt();
          while(t-->0){
             int n=sc.nextInt();
             ListNode head=new ListNode(sc.nextInt());
             ListNode tail=head;
             while(n-->1){
                tail.next=new ListNode(sc.nextInt());
                tail=tail.next;
             }
             Solution sol=new Solution();
             head=sol.sort(head);
             printll(head);
          }
          
     }
}
class Solution{
    static ListNode sort(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode mid=findmid(head);
        ListNode right=mid.next;
        mid.next=null;
        ListNode left=sort(head);
        right=sort(right);
        return merge(left,right);
    }
    static ListNode findmid(ListNode head){
        if(head==null)return head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    static ListNode merge(ListNode head1,ListNode head2){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next=head1;
                //temp=head1;
                head1=head1.next;
            }else{
                temp.next=head2;
               // temp=head2;
                head2=head2.next;
            }
            temp=temp.next;
        } 
        if(head1!=null)temp.next=head1;
        else temp.next=head2;
        return dummy.next;
    }
}