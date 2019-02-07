package com.lambdaschool;

public class Stack
{
    private String[] stack = new String[1000];
    private int currentSize = 0;

    public void push(String item)
    {
           stack[currentSize] = item;
           currentSize++;
//        System.out.println("item added: " + stack[currentSize-1]);
    }

    public String pop()
    {
        return stack[currentSize--];
    }

    public void numOfItems()
    {
        System.out.println(currentSize == 0 ? "There are no items in your Stack." : currentSize);
    }

    public void print()
    {
        if(currentSize == 0)
        {
            System.out.println("[]");
            return;
        }
        System.out.printf("[ ");
        for (int i = 1; i < currentSize; i++)
        {
            System.out.printf("'" + stack[i-1] + "', ");
        }
        System.out.printf("'" + stack[currentSize-1] + "' ]\n");
    }
}
