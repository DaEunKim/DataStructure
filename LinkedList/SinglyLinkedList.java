package LinkedList;

public class SinglyLinkedList {
	static node head = null;
	static int size = 0;
	
	class node{
		int elem;
		node next;
		
	}
	public void addFirst(int a){
		node k = new node();
		k.elem = a;
		k.next =head;
		head = k;
		size++;
	}
	public void addLast(int b){
		node n = new node();
		n.elem = b;
		
		node daeun = head;//last node 찾을 변수. 
		
		while(daeun.next != null)//last node가 null값이면 찾았다!!! 
			daeun = daeun.next;//last node에 daeun으로 표시. 
		daeun.next = n;//daeun에 다음 새로운 노드를 이어줌. 
		n.next = null;//last node가 다시 null값을 가리키게 해서 반복가능하게 함. 
		size++;
	}
	public int getFirst(){
		//get element
		
		return head.elem;
		
		
	}
	public int get(int index){
		node daeun2 = head;
		
		for(int i=0;i <index ;i++){
			daeun2 = daeun2.next;
			
		}
		return daeun2.elem;
	}
	public int getLast(){
		node daeun3 = head;
		while(daeun3.next != null){
			daeun3 = daeun3.next;
		}
		return daeun3.elem;
	}
	public void insert(int index, int elem){
		node init = new node();
		node daeun4 = head;
		
		init.elem = elem;
		for(int i=0;i<index-1;i++){
			daeun4 = daeun4.next;
			
		}
		init.next = daeun4.next;//새로 만든 노드를 다음 노드와 연결. 
		daeun4.next = init;//앞에 노드를 새로운 노드와 연결. 
		size++;
	}
	public int remove(int index){
		int delNum;//지워질 숫자; 
		
		if(index != 0){
			node daeun5 = head;
			
			for(int i=0;i<index-1;i++){
				daeun5 = daeun5.next;
			}
			delNum = daeun5.next.elem;
			daeun5.next=daeun5.next.next;
			
		}
		else{
			delNum = head.elem;
			head = head.next;
		}
		size--;
		return delNum;
	}
	public int size(){
		return size;
	}
	
	

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addFirst(10);
		list.addFirst(20); 
		list.addLast(40); 
		list.addLast(50); 
		list.addFirst(30); 
		list.addLast(60); 
		list.addLast(70);
		
		node daeun0 = head;
		for (int i=0;i<size;i++) {
			System.out.println(daeun0.elem);
			daeun0 = daeun0.next;
		}
		System.out.println("");
		
		System.out.println("Get[5] = " + list.get(5)); 
			System.out.println("First = " + list.getFirst()); 
			System.out.println("Last = " + list.getLast()); 
			System.out.println("Get[0] = " + list.get(0)); 
			System.out.println("Remove[0] = " + list.remove(0)); 
			System.out.println("First = " + list.getFirst());
			
			daeun0 = head;
			for (int i=0;i<size;i++) {
				System.out.println(daeun0.elem);
				daeun0 = daeun0.next;
			}
			System.out.println("");
			
			System.out.println("Remove[3] = " + list.remove(3)); 
			daeun0 = head;
			for (int i=0;i<size;i++) {
				System.out.println(daeun0.elem);
				daeun0 = daeun0.next;
			}
			
			System.out.println("Size = " + list.size());
		

	}

}
