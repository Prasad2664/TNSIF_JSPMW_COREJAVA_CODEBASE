package com.college;

public class day3_jumpstatment {
	public static void main(String[] args) {
		
		
	// break
		
		for(int i=5;i<10;i++) {
			if(i==5)
//			break;
			System.out.println(i);
			System.out.println("hello friends");
//			break;
		}
		
		
	//continue
		for(int i=5;i<10;i++) {
			if(i==7)
			continue;
			System.out.println(i);
			System.out.println("hello friends");
		}
		
		
		
	//switch
		int userinput=2;
		switch(userinput) {
		case 1:
			System.out.println(userinput +": current plane details");
			break;
			
		case 2:
			System.out.println(userinput +": offers");
			break;
			
		case 3:
			System.out.println(userinput +": sale ending");
			break;
		}
				
		
	}
}
