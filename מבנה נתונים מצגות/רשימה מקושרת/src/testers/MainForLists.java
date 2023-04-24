package testers;
import util.Lists;
import structures.*;

public class MainForLists {

	public static void main(String[] args) {
		Node<Integer> head = new Node<>(144, new Node<>(-5, new Node<>(201, 
							 			  new Node<>(12, null))));
		System.out.println(Lists.search(head, 144));
		System.out.println(Lists.search(head, 3));
		
		System.out.println(Lists.toString(head));
		Lists.add(head, 7);
		System.out.println(Lists.toString(head));
		
		Lists.add(Lists.search(head, -5), 10);
		System.out.println(Lists.toString(head));
		
		head = Lists.addFirst(head, 3);
		System.out.println(Lists.toString(head));
		
		head = Lists.deleteFirst(head);
		System.out.println(Lists.toString(head));
		
		Node<Integer> pos = Lists.search(head, 201);
		Lists.delete(head, pos);
		System.out.println(Lists.toString(head));
		
	}

}
