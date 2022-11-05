package homework;
import java.util.Scanner;
public class m {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		linkedlist l=new linkedlist();
		back: while(true) {
			System.out.println("請輸入此準備排隊之人對於插隊之人的態度(輸入數字即可)");
			System.out.println("1.有朋友且勇於說不之人");
			System.out.println("2.有朋友且不敢說不之人");
			System.out.println("3.沒朋友且讓人插隊之人");
			System.out.println("4.沒朋友且勇於說不之人");
			System.out.println("5.重情重義之人");
			System.out.println("6.正常人");
			System.out.println("7.沒有人要排隊了");
			String attitude;
			attitude=scn.nextLine();
			while(!(attitude.equals("1")||attitude.equals("2")||attitude.equals("3")||attitude.equals("4")||attitude.equals("5")||attitude.equals("6"))) {
				if(attitude.equals("7")) {
					break back;
				}
				else if(!(attitude.equals(""))) {
					System.out.println("輸入錯誤");
				}
				attitude=scn.nextLine();
			}
			System.out.println("請輸入此人對於插隊的想法(也是輸入數字即可)");
			System.out.println("1.凶悍且不管怎樣就是不會排隊之人");
			System.out.println("2.不太凶悍但想插隊之人");
			System.out.println("3.有朋友且厚臉皮之人");
			System.out.println("4.有朋友且很棒很守規則之人");
			System.out.println("5.有需求之人");
			System.out.println("6.正常人");
			String people;
			people=scn.nextLine();
			while(!(people.equals("1")||people.equals("2")||people.equals("3")||people.equals("4")||people.equals("5")||people.equals("6"))) {
				System.out.println("輸入錯誤");
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
						System.out.println("你這樣很矛盾喔，再輸入一次");
						people=scn.nextLine();
						if(!(people.equals("3")||people.equals("4"))) {
							break;
						}
					}
					System.out.println("請輸入他朋友的位置(從尾巴開始數)");
					System.out.println("若沒有朋友請輸入0");
					int p;
					p=scn.nextInt();
					while(p>l.getlength()) {
						System.out.println("輸入錯誤喔，隊伍沒有這麼長，請再次輸入");
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
							System.out.println("輸入錯誤!!他不是他朋友");
						}
						p=scn.nextInt();
					}
				}
				else if(people.equals("4")) {
					while(attitude.equals("3")||attitude.equals("4")) {
						System.out.println("你這樣很矛盾喔，請再次輸入");
						people=scn.nextLine();
						if(!(people.equals("3")||people.equals("4"))) {
							break;
						}
					}
					l.push(attitude);
					System.out.println("請輸入他朋友的位置(從尾巴開始數且包括新排隊的人)");
					System.out.println("若沒有朋友請輸入0");
					int p;
					p=scn.nextInt();
					while(p>l.getlength()) {
						System.out.println("輸入錯誤喔，隊伍沒有這麼長，請再次輸入");
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
		System.out.println("排隊結束!!!!!");
		l.display();
	}
}
