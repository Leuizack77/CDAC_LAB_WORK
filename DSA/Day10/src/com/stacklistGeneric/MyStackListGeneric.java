package com.stacklistGeneric;

public class MyStackListGeneric<T>
{
    private Node top;

    private class Node 
    {
        T data;
        Node next;

        public Node(T data) 
        {
            this.data = data;
            this.next = null;
        }
    }

    public MyStackListGeneric() 
    {
        top = null;
    }

    //Is Empty
    public boolean isEmpty() 
    {
        return top == null;
    }

    //push
    public void push(T value) 
    {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + value);
    }

    //pop
    public T pop() 
    {
        if (isEmpty())
        {
            System.out.println("Stack is Empty");
            return null;
        }
        else 
        {
            T value = top.data;
            top = top.next;
            return value;
        }
    }
}
