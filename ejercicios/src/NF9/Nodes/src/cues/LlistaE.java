package NF9.Nodes.src.cues;

public class LlistaE implements Cua {
	private int mida;
	private Node head;
	private Node tail;

	public LlistaE() {
		this.mida = 0;
		this.head = null;
		this.tail = null;
	}

	@Override
	public void encuar(Object item) {
		// TODO Auto-generated method stub
		Node nou = new Node(item);
		if (mida == 0) {
			this.head = nou;
		}

		else {
			this.tail.setNext(nou);
		}
		tail = nou;
		mida++;
	}

	@Override
	public Object desencuar() throws NullPointerException {
		Node eliminat;
		if (mida == 0) {
			eliminat = null;
			throw new NullPointerException("error: Null!");
		} else {
			eliminat = head;
			head = head.getNext();
			mida--;
		}
		return eliminat.getValue();

	}

	@Override
	public Object primer() {
		return this.head.getValue();
	}

	@Override
	public int mida() {
		return mida;
	}

	@Override
	public boolean esBuida() {
		// TODO Auto-generated method stub
		return mida == 0;
	}
	
	public boolean eliminar() {
		while(!this.esBuida()) {
			this.desencuar();
		}
		return this.esBuida();
	}
}
