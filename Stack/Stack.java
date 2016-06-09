package Stack;

import java.util.Scanner;

public class Stack {
	static int top;
	static int capacity;
	static String[] arr;
	public static void create(int size){
		arr = new String [size];
		top=0;
		capacity=size;
	}
	public static int size(){
		return top;
	}
	public static void push(String element){
		arr[top++] =element;
		}
	
	public static String pop(String element){
		if(top<0)
			return element;
		return arr[top--];
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input the Stack size : ");
		int size = in.nextInt();
		create(size);
		System.out.println("Stack.put := 100");
		Stack.push("100");
		System.out.println("Stack.put := 200");
		Stack.push("200");
		System.out.println("Stack.put := 300");
		Stack.push("300"); 
		System.out.println("Stack.put := 400");
		Stack.push("400");
		System.out.println("Print out Stack using Iterator");
		for (int iter = 0;iter<Stack.size(); iter++) {
			System.out.println("Stack[" + iter + "] = " + Stack.arr[iter]);
			}
		System.out.println("Stack.pop := " + Stack.pop("")); 
		System.out.println("Stack.pop := " + Stack.pop(""));
		System.out.println("Print out Stack using Iterator");
		for (int iter=0;iter<Stack.size(); iter++) {
			System.out.println("Stack[" + iter + "] = " + Stack.arr[iter]);
		}
		System.out.println("Stack.put := 400");
		Stack.push("900");
		System.out.println("Stack.size := " + Stack.size());
		System.out.println("Stack.pop := " + Stack.pop("")); 
		System.out.println("Stack.pop := " + Stack.pop("")); 
		System.out.println("Stack.pop := " + Stack.pop("")); 
		System.out.println("Stack.pop := " + Stack.pop("")); 
		System.out.println("Stack.pop := " + Stack.pop(""));
	}
}