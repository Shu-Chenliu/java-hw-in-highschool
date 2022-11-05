package homework;

public class node {
	private String kind;
	private node next;
	public node(String d) {
		kind=d;
	}
	public void setnext(node n) {
		next=n;
	}
	public String getdata() {
		return kind;
	}
	public node getnext() {
		return next;
	}
}
