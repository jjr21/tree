package Interface;

public class Bee implements Wasp {

	private String Kind;
	private boolean status;
	private String colorBee;
	private String wasp = "";
	public Bee() {
		Kind = " ";
		status = false;
		colorBee = " ";
	}
	public void setKind(String k) {
		Kind = k;
	}
	public void setStatus(boolean t) {
		status = t;
	}
	public void setColorBee(String col) {
		colorBee = col;
	}
	public void setWasp(String s) {
		wasp = s;
	}
	public String getKind() {
		return Kind;
	}
	public boolean getStatus() {
		return status;
	}
	public String getColorBee() {
		return colorBee;
	}
	public String getWasp() {
		return wasp;
	}
	public String toString() {
		String str = "Kind of Bee : " + Kind + " boolean status : " + status + " color of bee : " + colorBee;
		return str;
	}
}
