package homework;

public class linkedlist {
	private node head; 
	private int length=0;
	public linkedlist() {
		head = new node("0");
		head.setnext(null);
	}
	public void insert(int p, String data) {
		if(length<p) {
			System.out.print("��J���~!!!");
		}
		else {
			node a=new node(data);
			node c=head;
			for(int i=1;i<p;i++) {
				c=c.getnext();
			}
			a.setnext(c.getnext());
			c.setnext(a);
			length++;
		}
	}
	public void append(String data) {//���J���Y
		node a=new node(data);
		a.setnext(null);
		if(length==0) {
			head=a;
		}
		else {
			node c=head;
			for(int i=1;i<length;i++) {
				c=c.getnext();
			}
			c.setnext(a);
			
		}
		length++;
	}
	public void push(String data) {//�q�Ƨ��[�J
		node a=new node(data);
		a.setnext(null);
		if(length==0) {
			head=a;
		}
		else {
			a.setnext(head);
			head=a;
		}
		length++;
	}
	public void delete(int p) {
		node c=head;
		if(length<p||p<=0) {
			System.out.print("��J���~!!!");
		}
		else if(p==1) {
			head=c.getnext();
			length--;
		}
		else {
			for(int i=1;i<p-1;i++) {
				c=c.getnext();
			}
			node temp=c.getnext();
			c.setnext(c.getnext().getnext());
			temp.setnext(null);
			length--;
		}
	}
	
	public int getlength() {
		return length;
	}
	public void display() {
		node c=head;
		for(int i=0;i<length;i++) {
			System.out.print(c.getdata()+"--> ");
			c=c.getnext();
		}
		System.out.println("�S���H�F");
	}
	public node h() {
		return head;
	}
	public String data(int p) {
		node a=head;
		for(int i=1;i<p;i++) {
			a=a.getnext();
		}
		return a.getdata();
	}
}
