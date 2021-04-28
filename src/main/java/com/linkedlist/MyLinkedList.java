package com.linkedlist;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public void MyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    // Method to add node
    public void add(INode newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        }
        else{
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    // Method to append node
    public void append( INode newNode) {
        if (this.tail== null){
            this.tail = newNode;
        }
        if (this.head==null){
            this.head=newNode;
        }
        else{
            this.tail.setNext(newNode);
            this.tail=newNode;
        }
    }
    // Method to insert node in between
    public void insert(INode myNode, INode newNode) {
        INode tempNode= myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    // Method to print nodes
    public void print() {
        StringBuffer myNodes= new StringBuffer("All nodes : ");
        INode tempNode = head;
        while(tempNode.getNext() != null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail))
                myNodes.append("points to");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
