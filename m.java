package homework;
import java.util.Scanner;
public class m {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		linkedlist l=new linkedlist();
		back: while(true) {
			System.out.println("�п�J���ǳƱƶ����H��󴡶����H���A��(��J�Ʀr�Y�i)");
			System.out.println("1.���B�ͥB�i�󻡤����H");
			System.out.println("2.���B�ͥB�����������H");
			System.out.println("3.�S�B�ͥB���H�������H");
			System.out.println("4.�S�B�ͥB�i�󻡤����H");
			System.out.println("5.�������q���H");
			System.out.println("6.���`�H");
			System.out.println("7.�S���H�n�ƶ��F");
			String attitude;
			attitude=scn.nextLine();
			while(!(attitude.equals("1")||attitude.equals("2")||attitude.equals("3")||attitude.equals("4")||attitude.equals("5")||attitude.equals("6"))) {
				if(attitude.equals("7")) {
					break back;
				}
				else if(!(attitude.equals(""))) {
					System.out.println("��J���~");
				}
				attitude=scn.nextLine();
			}
			System.out.println("�п�J���H��󴡶����Q�k(�]�O��J�Ʀr�Y�i)");
			System.out.println("1.�����B���ޫ�˴N�O���|�ƶ����H");
			System.out.println("2.���Ӥ������Q�������H");
			System.out.println("3.���B�ͥB�p�y�֤��H");
			System.out.println("4.���B�ͥB�ܴΫܦu�W�h���H");
			System.out.println("5.���ݨD���H");
			System.out.println("6.���`�H");
			String people;
			people=scn.nextLine();
			while(!(people.equals("1")||people.equals("2")||people.equals("3")||people.equals("4")||people.equals("5")||people.equals("6"))) {
				System.out.println("��J���~");
				people=scn.nextLine();
			}
			if(l.getlength()==0) {
				l.push(attitude);
			}
			else if(l.getlength()!=0) {
				if(people.equals("1")||people.equals("5")) {
					l.append(attitude);
				}
				else if(people.equals("2")) {
					node a=l.h();
					int p=0;
					while(p+1<l.getlength()&&!(a.getdata().equals("1")||a.getdata().equals("4"))) {
						a=a.getnext();
						p++;
					}
					if(p>0) {
						l.insert(p, attitude);
					}
					else{
						l.push(attitude);
					}
				}
				else if(people.equals("3")) {
					while(attitude.equals("3")||attitude.equals("4")) {
						System.out.println("�A�o�˫ܥ٬޳�A�A��J�@��");
						people=scn.nextLine();
						if(!(people.equals("3")||people.equals("4"))) {
							break;
						}
					}
					System.out.println("�п�J�L�B�ͪ���m(�q���ڶ}�l��)");
					System.out.println("�Y�S���B�ͽп�J0");
					int p;
					p=scn.nextInt();
					while(p>l.getlength()) {
						System.out.println("��J���~��A����S���o����A�ЦA����J");
						p=scn.nextInt();
					}
					if(p==0) {
						l.push(attitude);
					}
					while(p!=0) {
						String s=l.data(p);
						if(s.equals("1")||s.equals("2")) {
							l.insert(p-1, attitude);
							break;
						}
						else {
							System.out.println("��J���~!!�L���O�L�B��");
						}
						p=scn.nextInt();
					}
				}
				else if(people.equals("4")) {
					while(attitude.equals("3")||attitude.equals("4")) {
						System.out.println("�A�o�˫ܥ٬޳�A�ЦA����J");
						people=scn.nextLine();
						if(!(people.equals("3")||people.equals("4"))) {
							break;
						}
					}
					l.push(attitude);
					System.out.println("�п�J�L�B�ͪ���m(�q���ڶ}�l�ƥB�]�A�s�ƶ����H)");
					System.out.println("�Y�S���B�ͽп�J0");
					int p;
					p=scn.nextInt();
					while(p>l.getlength()) {
						System.out.println("��J���~��A����S���o����A�ЦA����J");
						p=scn.nextInt();
					}
					if(p==0) {
						l.push(attitude);
					}
					else if(p!=0) {
						String s=l.data(p);
						if(s.equals("5")) {
							l.delete(p);
							l.push("5");
							break;
						}
						else {
							l.push(attitude);
						}
					}
				}
				else {
					l.push(attitude);
				}
				l.display();
			}
		}
		scn.close();
		System.out.println("�ƶ�����!!!!!");
		l.display();
	}
}
