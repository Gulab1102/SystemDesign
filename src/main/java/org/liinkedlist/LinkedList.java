package org.liinkedlist;

import java.util.Stack;

public class LinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
           this.data=data;
           next=null;
        }
    }

    static Node reverse(Node head){
        Node curr=head;


        Node pre=null;

        Node next=null;

        while(curr.next!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;

            curr=next;

        }
        curr.next=pre;
        head=curr;

        return head;
    }

    static void rev(Node head){


        Node curr=head;

        Stack<Node> stack=new Stack<>();

        while (curr!=null){
            stack.push(curr);
            curr=curr.next;
        }

        Node hd=stack.pop();
        LinkedList.head=hd;

        while (!stack.isEmpty()){
            hd.next=stack.pop();
            hd=hd.next;
        }
        hd.next=null;



    }

    static void printNode(Node head){
        while (head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args) {

        LinkedList.head=new Node(85);

        LinkedList.head.next=new Node(15);

        LinkedList.head.next.next=new Node(4);

        LinkedList.head.next.next.next=new Node(20);

     //  LinkedList.head= reverse(LinkedList.head);

        rev(LinkedList.head);



        printNode(LinkedList.head);







    }

}
