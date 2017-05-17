package com.dhanya.array;
import java.util.*;

public class VacationScale {
	
	public int[] vacationDays;
	
	public void setVacationOnScale() {
		
		vacationDays = new int[7];
		vacationDays[0] = 15;
		vacationDays[1] = 15;
		vacationDays[2] = 15;
		vacationDays[3] = 15;
		vacationDays[4] = 20;
		vacationDays[5] = 20;
		vacationDays[6] = 25;
		
	}
	
	public void disaplayVacationDays(int[] yearsOfService){
		for(int i =0; i< yearsOfService.length; i++){
			if(yearsOfService[i] >0 && yearsOfService[i] <=6){
				System.out.println("Vacation days are:" + vacationDays[i]);
			}
			
			else if(yearsOfService[i] >6) {
				System.out.println("Vacation days are :" + vacationDays[i]);
			}
			
			else{
				System.out.println("Invalid error");
			}
		}
		
	}

	
	public static void main(String[] args) {
		
		VacationScale vScale = new VacationScale();
		vScale.setVacationOnScale();
		int [] years = {0,1,2,3,4,5,6};
		vScale.disaplayVacationDays(years);
	}

	
}
