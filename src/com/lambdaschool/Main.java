package com.lambdaschool;

public class Main {

    public static void main(String[] args) {
	    Stack testStack = new Stack();
	    testStack.numOfItems();
	    testStack.push("first");
	    testStack.push("second");
	    testStack.push("third");
	    testStack.numOfItems();
	    testStack.print();
	    testStack.pop();
	    testStack.print();
	    testStack.pop();
	    testStack.print();
	    testStack.pop();
	    testStack.print();
	    testStack.numOfItems();
    }
}
