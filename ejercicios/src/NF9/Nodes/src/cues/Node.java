package NF9.Nodes.src.cues;

public class Node {
	
	Object value;
	Node next;
	
	
	public Node(Object value) {
		super();
		if (this.value == null) throw new AlertaNuls("Node buit!");
		this.value = value;
	}


	public Object getValue() {
		if (value == null) throw new AlertaNuls("Valor buit!");
		return value;
	}


	public void setValue(Object value) {
		if (this.value == null) throw new AlertaNuls("Valor buit!");
		this.value = value;
	}


	public Node getNext() {
		if (next == null) throw new AlertaNuls("Node buit!");
		return next;
	}


	public void setNext(Node next) {
		if (this.next == null) throw new AlertaNuls("Node buit!");
		this.next = next;
	}
	

}
