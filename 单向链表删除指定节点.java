import java.util.*;
 
public class Main{
     
    static class ListNode{
        int val;
        ListNode next;
          
    }
     public static void main(String[] args)
     {
     Scanner sc=new Scanner(System.in);
     while(sc.hasNextInt())
         {
          
          int num = sc.nextInt();
            int h = sc.nextInt();
            ListNode head = new ListNode();
            head.val= h;
         
         for (int i = 0; i < num - 1; i++) {
                int newVal = sc.nextInt();
                int afterVal = sc.nextInt();
                addNode(newVal, afterVal, head);
            }
  
            int del = sc.nextInt();
         head=delete(del,head);
         System.out.println(getString(head));
           
           
            
     }
     sc.close();
 }
   
    private static void addNode(int newVal, int afterVal, ListNode head) {
        ListNode n = head;
        while (n != null) {
            if (n.val == afterVal) {
                ListNode node = new ListNode();
                node.val = newVal;
                node.next = n.next;
                n.next = node;
                break;
            }
            n = n.next;
        }
    }
     private static ListNode delete(int val, ListNode head) {
        if (head.val== val) {
            ListNode ret = head.next;
            head.next = null;
            return ret;
        } else {
            ListNode prev = head;
            while (prev.next != null) {
                if (prev.next.val == val) {
                    prev.next = prev.next.next;
                    break;
                }
                prev = prev.next;
            }
  
            return head;
        }
    }
       
      private static String getString(ListNode head) {
        StringBuilder builder = new StringBuilder();
  
        while (head!= null) {
            builder.append(head.val).append(' ');
            head = head.next;
        }
  
//        return builder.substring(0, builder.length() - 1);
        return builder.toString();
    }
}
