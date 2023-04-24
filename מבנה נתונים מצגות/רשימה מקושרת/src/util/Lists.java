package util;
import structures.Node;

public class Lists {
	public static String toString(Node<Integer> head) {
		String str = "[";
		while(head != null) {
			str += head.getValue();
			if(head.getNext() != null)
				str += ", ";
			head = head.getNext();
		}
		str += "]";
		return str;
		
	}
	public static Node<Integer> search(Node<Integer> head, int item){
		//from head until we reach the end of list
		for(Node<Integer> pos = head; pos != null; pos = pos.getNext())
			if(pos.getValue().equals(item)) //if the value of the node equals to item
				return pos; //return the node
		return null; //if not found in list
	}
	public static void add(Node<Integer> pos, int x) {
		/*Node<Integer> pnew = new Node<>(x,pos.getNext());
		pos.setNext(pnew);*/
		pos.setNext(new Node<>(x,pos.getNext()));
	}
	public static Node<Integer> addFirst(Node<Integer> head, int x) {
		return new Node<>(x,head);
	}
	public static Node<Integer> deleteFirst(Node<Integer> head) {
		return head.getNext();
	}
	public static void delete(Node<Integer> head, Node<Integer> pos) {
		Node<Integer> prev = head;
		while(prev.getNext() != pos)
			prev = prev.getNext();
		prev.setNext(pos.getNext());	
	}
	public static Node<Integer> addSorted(Node<Integer> head, Integer x) {
		if(head == null)
			return new Node<>(x);
		if(x < head.getValue())
			return addFirst(head,x);
		Node<Integer> pos = head;
		while(pos.getNext() != null && pos.getNext().getValue()<x)
			pos = pos.getNext();	
		add(pos, x);	
		return head;
	}
}
