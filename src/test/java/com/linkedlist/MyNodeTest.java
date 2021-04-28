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
        MyNode<Integer> firstNode = new MyNode(56);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);
        Assertions.assertTrue(myLinkedList.head.equals(thirdNode) && myLinkedList.head.getNext().equals(secondNode) && myLinkedList.tail.equals(firstNode));

    }
}
