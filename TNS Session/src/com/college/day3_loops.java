package com.college;

public class day3_loops {
	public static void main(String[] args) {
		
		// for loop
		String name ="prasad";
		for(int i=0;i<5;i++) {
			System.out.println(name);
		}
		
		
		//while loop
		int userinput=90;
		while(userinput<=100) {
			System.out.println(userinput);
			userinput++;
		}
		
		//do while loop
		int i=8;
		do {
			System.out.println(i);
			i++;
		}
		while(i<10);
		
		
		//for each
		//dtype   arrayname bracket = data in curly bracket
		int a[] = {10,20,30,40,50};
		for (int e:a) {
			System.out.print(e+"\t");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
