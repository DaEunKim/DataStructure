package Queue;
import java.util.Scanner;
public class CircularQueue {
	static String[] arr;
	static int front;
	static int rear;
	static int volume;	// size of queue
	static int size; //number of element 
	public static void create(int v){
		volume = v;
		arr = new String [v];
		front=0;
		rear=0;
		size=0; }
	public static int size(){
		return size; }
	public static void enQueue(String element){
		size++;// 사이즈를 늘려감. 
		if(rear == volume){//rear가 배열 크기와 같으면 초기화 해준 후에 값을 넣는다. 
			rear = 0;
			arr[rear++]=element;
			for(int i =front;i<volume;i++){
				System.out.print(arr[i]+" "); }
			for(int i=0;i<rear;i++){
				System.out.print(arr[i]+" "); }
		}
		else{//아니면 그냥 값을 넣어준다. 
			arr[rear++]=element;
			for(int i =front;i<rear;i++){
				System.out.print(arr[i]+" "); }
		}
		System.out.println("");
	}
	public static String deQueue(){
		if(size()==0)
			return "";
		String temp = arr[front++];
		System.out.println("Dequeue : " + temp);
		size--;
		if(front<=rear){//front가 rear보다 작거나 같으면 front에서 rear까지 출력. 
			for(int i=front; i<rear; i++){
				System.out.print(arr[i]+" "); }
		}
		else{//front보다 rear가 크면 front에서 volume까지만 출력하고 커진 rear를 다시 출력.   
			for(int i =front;i<volume;i++){
				System.out.print(arr[i]=temp + " "); }
			for(int i=0; i<rear; i++){
				System.out.print(arr[i]+" "); }
			}
		System.out.println("");
		return temp;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the size: ");
		create(in.nextInt());
		System.out.println("EnQueue: 10");
		CircularQueue.enQueue("10");
		System.out.println("EnQueue: 20");
		CircularQueue.enQueue("20");
		System.out.println("EnQueue: 30");
		CircularQueue.enQueue("30");
		System.out.println("EnQueue: 40");
		CircularQueue.enQueue("40");
		System.out.println("EnQueue: 50");
		CircularQueue.enQueue("50");
		System.out.println("");
		CircularQueue.deQueue();
		CircularQueue.deQueue();
		CircularQueue.deQueue();
		CircularQueue.deQueue();
		CircularQueue.deQueue();
		System.out.println("\nEeQueue: 100");
		CircularQueue.enQueue("100");
		System.out.println("\nEeQueue: 200");
		CircularQueue.enQueue("200");
		System.out.println("\nEeQueue: 300");
		CircularQueue.enQueue("300");
		CircularQueue.deQueue();
		CircularQueue.deQueue();
		System.out.println("\nEeQueue: 900");
		CircularQueue.enQueue("900");
	}
}