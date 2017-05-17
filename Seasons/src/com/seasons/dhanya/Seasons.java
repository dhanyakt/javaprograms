package com.seasons.dhanya;

public class Seasons {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Seasons[] seasonsarray = new Seasons[3];
		seasonsarray[0] = new Winter();
		seasonsarray[1] = new Summer();
		seasonsarray[2] = new Autumn();
		
		for (Seasons season: seasonsarray)
		{
			season.printWeather();
		}
		
	}
	
	public void printWeather(){
		System.out.println("Seasons!");
	}

}
