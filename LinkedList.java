//Name: Alfonzo Galvan
//UIN: 622004824
public class LinkedList<T> implements Iterable<T>{
	public Node<T> head=null;

	public LinkedList() {
		head=null;
	}

	public LinkedList(Iterable<T> iterable) {
		for (T e : iterable) {
			Node<T> n1 = new Node<T> (e,head);
			head= n1;
		}
	}

	public LinkedList(Node<T> n) {
		head = n;
	}

	public LinkedList<T> reverse() {
		if (head==null) {
			return this;
		}
		Node<T> revList = null;
		for (T e:head) {
			Node<T> n1 = new Node<T> (e,revList);
			revList = n1;
		}
		LinkedList<T> rev = new LinkedList<T>(revList);
		return rev;
	}

	public String toString(){
		if (head==null) {
			return "[]";
		}
		LinkedList<T> rev = this.reverse();
		String str = "["+rev.head.v.toString();
		for (T e : rev.head.next) {
			str = str + "," +e;
		}
		str=str+"]";
		return str;
	}

	public NodeIterator<T> iterator(){
    	NodeIterator<T> b = new NodeIterator(head);
    	return b;
    }
}