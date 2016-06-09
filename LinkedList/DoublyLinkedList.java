package LinkedList;
public class DoublyLinkedList {
	static node head = null;
	static int size = 0;
	class node{
		int elem;
		node next;
		node prev; }
	public void addFirst(int a){
		if(head != null){
			node k = new node();
			k.elem = a;
			head.prev =k;//앞에 노드를 가르킴 . 
			k.next =head;
			head = k;
			size++; }
		else{
			node k = new node();
			k.elem = a; 
			k.next =head;
			head = k;
			size++; }
	}
	public void addLast(int b){
		node n = new node();
		n.elem = b;
		node daeun = head;//last node 찾을 변수. 
		while(daeun.next != null)//last node가 null값이면 찾았다!!! 
			daeun = daeun.next;//last node에 daeun으로 표시. 
		daeun.next = n;//daeun에 다음 새로운 노드를 이어줌. 
		n.prev=daeun;//서로 가르킨다. 
		n.next = null;//last node가 다시 null값을 가리키게 해서 반복가능하게 함. 
		size++; }
	public int getFirst(){ //get element
		return head.elem; }
	public int get(int index){
		node daeun2 = head;
		for(int i=0;i <index ;i++){
			daeun2 = daeun2.next; }
		return daeun2.elem;
	}
	public int getLast(){
		node daeun3 = head;
		while(daeun3.next != null){
			daeun3 = daeun3.next; }
		return daeun3.elem;
	}
	public void insert(int index, int elem){
		if(index == 0){
			addFirst(elem);
			return;
		}//index가 0일 경우엔 앞에 넣어줘야 함으로 addFirst함수에서 처리. 
		node init = new node();
		node daeun4 = head;
		init.elem = elem;
		for(int i=0;i<index-1;i++){
			daeun4 = daeun4.next;
		}
		init.next = daeun4.next;//새로 만든 노드를 다음 노드와 연결. 
		init.prev= daeun4;//서로 가르킴. 
		daeun4.next = init;//앞에 노드를 새로운 노드와 연결. 
		size++;
	}
	public int remove(int index){
		int delNum;//지워질 숫자; 
		if(index==size-1){
			node daeun5 = head;
			for(int i=0;i<index-1;i++){
				daeun5 = daeun5.next;
			}
			delNum = daeun5.next.elem;
			daeun5.next = null;
			size--;
			return delNum;
		}
		if(index != 0){
			node daeun5 = head;
			for(int i=0;i<index-1;i++){
				daeun5 = daeun5.next; }
			delNum = daeun5.next.elem;
			daeun5.next=daeun5.next.next;
			daeun5.next.next.prev = daeun5; }
		else{
			delNum = head.elem;
			head = head.next; }
		size--;
		return delNum;
	}
	public int size(){
		return size; }
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		System.out.println("AddFirst: 10"); 
		list.addFirst(10); 
		System.out.println("AddFirst: 20"); 
		list.addFirst(20); 
		System.out.println("AddLast: 30"); 
		list.addLast(30); 
		System.out.println("AddFirst: 40"); 
		list.addFirst(40); 
		System.out.println("AddLast: 50"); 
		list.addLast(50); 
		System.out.println("AddFirst: 60"); 
		list.addFirst(60); 
		System.out.println("AddFirst: 70"); 
		list.addFirst(70);
		node daeun0 = head;
		for (int i=0;i<size;i++) {
			System.out.print(daeun0.elem+" ");
			daeun0 = daeun0.next; }
		System.out.println("");
		System.out.println("Insert[0]: 80"); 
		list.insert(0, 80); 
		System.out.println("Insert[0]: 90"); 
		list.insert(0, 90); 
		System.out.println("Insert[5]: 100"); 
		list.insert(5, 100); 
		System.out.println("Insert[9]: 110"); 
		list.insert(9, 110);
		daeun0 = head;
		for (int i=0;i<size;i++) {
			System.out.print(daeun0.elem+" ");
			daeun0 = daeun0.next; }
		System.out.println("");
		System.out.println("Remove: " + list.remove(0)); 
		System.out.println("Remove: " + list.remove(0)); 
		System.out.println("Remove: " + list.remove(8)); 
		System.out.println("Remove: " + list.remove(5));
		daeun0 = head;
		for (int i=0;i<size;i++) {
			System.out.print(daeun0.elem+" ");
			daeun0 = daeun0.next; }
	}
}
