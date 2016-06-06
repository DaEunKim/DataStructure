package Queue;

import java.util.Scanner;

public class Queue {
	static String[] arr;
	static int front;
	static int rear;
	
	public static void create(int size){
		arr = new String [size];
		front=0;
		rear=0;
	}
	
	public static void refresh(){
		int temp = front;
		for(int i=0;i<size();i++){
			arr[i]=arr[temp++];	
		}
		rear -= front;
		front = 0;
		
	}
	
	public static int size(){
		return rear-front;
	}

	public static void enQueue(String element){
		arr[rear++]=element;
		for(int i=0;i<size();i++){
			
			System.out.print(arr[front+i]+" ");
			
		}
		System.out.println("");
		
		
	}
	
	public static String deQueue(){
		if(size()==0)
			return "";
		
		String temp = arr[front++];
		System.out.println("Dequeue : " + temp);
		refresh();
		
		for(int i=0; i<size(); i++){
			System.out.print(arr[i]+" ");			
		}
		System.out.println("");
		return temp;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input the size: ");
		create(in.nextInt());
		
		System.out.println("EnQueue: 10");
		Queue.enQueue("10");
		System.out.println("EnQueue: 20");
		Queue.enQueue("20");
		System.out.println("EnQueue: 30");
		Queue.enQueue("30");
		System.out.println("EnQueue: 40");
		Queue.enQueue("40");
		
		
		
		System.out.println("EnQueue: 50");
		Queue.enQueue("50");
	
		System.out.println("");
		
		Queue.deQueue();
		Queue.deQueue();
		Queue.deQueue();
		Queue.deQueue();
		Queue.deQueue();
		
		
		System.out.println("\nEeQueue: 80");
			
		Queue.enQueue("80");
			
		System.out.println("\nEeQueue: 90");
			
		Queue.enQueue("90");
		
	}

}