package myTry;

import java.util.LinkedList;
import java.util.Scanner;

public class trainings {

	public static void main(String[] args) {
		System.out.println("Hello Lokesh \n" + "Jil");
		
        LinkedList<String> first=new LinkedList<String>();
        LinkedList<String> second=new LinkedList<String>();
        LinkedList<String> abc=new LinkedList<String>();
        first.add("apple");
        first.add("banana");
        second.add("cherry");
        second.add("mango");
        for(int i=0;i<=2;i++) {
        	abc=first;
        	System.out.println(abc + " " +i);
        	for(int j=0;j<3;j++) {
        		if(j==2) {
        			break;
        		}
        		System.out.println(j);
        	}
        }
        
        for(int i=0;i<2;i++) {
        	abc=second;
        }
        abc.add("happy");
        System.out.println(abc);
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int number=Integer.valueOf(scan.nextLine());
        System.out.println("You gave the number "+Integer.valueOf(2+number));
        System.out.println("You gave the number "+ (number+3));
	}

}
