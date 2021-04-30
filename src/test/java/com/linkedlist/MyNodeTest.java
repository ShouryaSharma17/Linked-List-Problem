package com.linkedlist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MyNodeTest {
    // Test to verify three nodes are linked
    @Test
    public void givenInput_ToLinkedList_ShouldPassTest() {

        MyNode<Integer> firstNode = new MyNode(56);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(70);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        Assertions.assertTrue(firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode));
    }
    // Test to add elements at front
    @Test
    public void givenInput_ToLinkedList_ShouldAddToFront(){
        MyNode<Integer> firstNode = new MyNode(70);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(56);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);
        Assertions.assertTrue(myLinkedList.head.equals(thirdNode) && myLinkedList.head.getNext().equals(secondNode) && myLinkedList.tail.equals(firstNode));
    }
    //Test to verify if the elements have appended
    @Test
    public void givenInput_ToLinkedList_ShouldAppendToElement(){
        MyNode<Integer> firstNode = new MyNode(56);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        Assertions.assertTrue(myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secondNode) && myLinkedList.tail.equals(thirdNode));
    }
    // Test to verify if the elements are inserted in between
    @Test
    public void givenInput_ToLinkedList_ShouldInsertedInBetween(){
        MyNode<Integer> firstNode = new MyNode(56);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        Assertions.assertTrue(myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secondNode) && myLinkedList.tail.equals(thirdNode));
    }
    // Test to verify if first element is deleted
    @Test
    public void givenFirstElement_WhenDeleted_ShouldPassTest(){
        MyNode<Integer> firstNode = new MyNode(56);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        INode deletedElement = myLinkedList.popElements();
        Assertions.assertTrue(deletedElement.equals(firstNode) && myLinkedList.head.equals(secondNode) && myLinkedList.tail.equals(thirdNode));
    }
    // Test to verify if last element is deleted
    @Test
    public void givenList_DeletedLastElement_ShouldPassTest(){
        MyNode<Integer> firstNode = new MyNode(56);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        INode deletedElement = myLinkedList.popLastElement();
        Assertions.assertTrue(deletedElement.equals(thirdNode) && myLinkedList.head.equals(firstNode) && myLinkedList.tail.equals(secondNode));
    }
    // Test to verify if the searched element is found
    @Test
    public void givenElement_WhenFound_ShouldPassTest(){
        MyNode<Integer> firstNode = new MyNode(56);
        INode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        INode searchedElement = myLinkedList.searchElement(secondNode.getKey());
        Assertions.assertTrue(myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.tail.equals(thirdNode) && searchedElement.equals(secondNode));
    }
    // Test to verify if the element is inserted
    @Test
    public void givenElement_WhenFound_ShouldBeInserted_ShouldPassTest(){
        MyNode<Integer> firstNode = new MyNode(56);
        INode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(70);
        MyNode<Integer> fourthNode = new MyNode(40);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.insertNode(fourthNode);
        Assertions.assertTrue(myLinkedList.head.equals(firstNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.head.getNext().getNext().equals(fourthNode) &&
                myLinkedList.tail.equals(thirdNode));
    }
}
