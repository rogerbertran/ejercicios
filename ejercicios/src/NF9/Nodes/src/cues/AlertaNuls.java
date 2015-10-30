package NF9.Nodes.src.cues;

public class AlertaNuls extends NullPointerException{
	
	private static final long serialVersionUID = 1;
	/**
	 * 
	 */
	
	String msg;
	
	public AlertaNuls(String c) {
		this.msg = c;
	}
	
	public String toString() {
		return "Avís en Gestió de cues: " + msg;
	}
}
