package homework;

import java.util.Scanner;

public class mmm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		linkedlist l=new linkedlist();
		l.push("2");
		l.push("4");
		l.push("6");
		System.out.println(l.h().getdata());
		
		l.append("3");

		l.delete(1);
		System.out.println(l.h().getdata());
		l.display();
		scn.close();

	}

}
