import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
   
   
   
public class Main{
    public static class Node{
        int self;
        Node next;
        public Node(int value){
            this.self=value;
        }
    }
    //在尾部添加
    public static void addintail(Node tail,Node new_tail){
        tail.next=new_tail;
    }
       
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line="";
        while((line=br.readLine())!=null){
            int n=Integer.valueOf(line);//节点个数
            line=br.readLine();//节点的数据
            String[] data=line.split(" ");
            int k=Integer.valueOf(br.readLine());//需要查找的节点
            Node head=null;
            Node tail=null;
            for(int i=0;i<n;i++) {
                Node node=new Node(Integer.valueOf(data[i]));
                if(i==0) {
                    head=node;
                    tail=node;
                }
                if(i!=0) {
                    addintail(tail,node);
                    tail=node;
                }
                   
            }
            Node node1=head;
            int x=n-k+1;
            int get=0;
            if(k==1){
                System.out.println(tail.self);
                continue;
            }
            while(node1.next!=null){//判断node1是不是尾节点
                x--;
                if(x==0) {
                    System.out.println(node1.self);
                    get=1;
                    break;      
                }
                node1=node1.next;
            }
            if(get==0){
                System.out.println(0);
            }
        }
    }
}
