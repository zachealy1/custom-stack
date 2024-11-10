package main;

import stacks.Stack;
import stacks.StackTwo;

public class Main {

	public static void main(String[] args) {
		System.out.println("---Original Array---");
		System.out.println(System.currentTimeMillis());
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(System.currentTimeMillis());
		
		System.out.println("---New Array---");
		System.out.println(System.currentTimeMillis());
		StackTwo<Integer> stackTwo = new StackTwo<>();
		stackTwo.push(10);
		stackTwo.push(20);
		stackTwo.push(30);
		System.out.println(System.currentTimeMillis());
		
	}

}
