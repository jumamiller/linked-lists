package com.bikebuka.portal;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.head = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);

        //connect nodes
        linkedList.head.next=second;
        second.next=third;

        //print node values
        while(linkedList.head!=null){
            System.out.println(linkedList.head.value+" ");
            linkedList.head= linkedList.head.next;
        }
    }
}
