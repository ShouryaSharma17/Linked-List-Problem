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
    // Method to delete first element from the list
    public INode popElements(){
        INode tempNode= this.head;
        this.head=head.getNext();
        return tempNode;
    }
    // Method to delete last element from list
    public INode popLastElement(){
        INode tempNode=this.head;
        while(!tempNode.getNext().equals(tail)){
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode=tempNode.getNext();
        return tempNode;
    }
    // Method to search elements
    public INode searchElement(Integer key){
        INode tempNode= head;
        INode searchedNode = null;
        while(tempNode != null && tempNode.getNext() != null) {
            if(tempNode.getKey().equals(key))
                searchedNode=tempNode;
            tempNode=tempNode.getNext();
        }
        return searchedNode;
    }
    // Method to search and insert that element in list
    public void insertNode(INode myNode){
        INode tempNode = head;
//        INode insertedNode= null;
        while(tempNode != null && tempNode.getNext() != null) {
            if(tempNode.getKey().equals(30)){
                myNode.setNext(tempNode.getNext());
                tempNode.setNext(myNode);
                break;
            }
            else
            tempNode = tempNode.getNext();
        }
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

