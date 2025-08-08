package com.college;

public class day4_taxcalculate {
	
	//function to calculate tax
	public void CalculateTax(day4_taxdata person) {
	if(person.getAge()>60 || person.getGender() .equalsIgnoreCase("female")) {
		person.setTax(0);
		System.out.println("Tax not applicable");
	}
	else {
		if(person.getIncome()<=160000) {
			person.setTax(0);
		}
		else if(person.getIncome()>160000 && person.getIncome()<=5000000) {
			person.setTax((person.getIncome()-160000)*10/100);
		}
		else if(person.getIncome()>160000 && person.getIncome()<=8000000) {
			person.setTax((person.getIncome()-500000)*20/100+34000);
		}
		else {
			person.setTax((person.getIncome()-800000)*30/100);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
