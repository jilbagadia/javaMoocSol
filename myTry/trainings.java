package myTry;

import java.util.LinkedList;
import java.util.Scanner;

public class trainings {

	public static void main(String[] args) {
		System.out.println("Hello Bro \n" + "Jil");
		
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
        int i,m=0,flag=0;      
    	int n=3;    
    	m=n/2;      
    	if(n==0||n==1){  
    	   System.out.println(n+" is not prime number");      
    	  }else{  
    	   for(i=2;i<=m;i++){      
    	    if(n%i==0){      
    	     System.out.println(n+" is not prime number");      
    	     flag=1;      
    	     break;      
    	    }      
    	   }      
    	   if(flag==0)  { System.out.println(n+" is prime number"); }  
    	  }
    	System.out.println("Hello commit1");
    }
//doing some lol changes like editing the code from remote branch directly
	
}
