package com.dhanya.sample;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {
	private final void flipper() {
		
	}
	String name;
	Sample(String name){
		this.name = name;
	}
	

  public Sample() {
  // TODO Auto-generated constructor stub
	  System.out.println(name);
  }


public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sample sample = new Sample();
	Sample sample2 = new Sample("dhanya");
	sample.go();
	String[] names = {"dhanya", "sanju","arun"};
	List sList = Arrays.asList(names);
	
		
		
		
		
		
		/*// Enchanced for loop
		String[] words = {"achan","amma","dhanya","sanju"};
		for(String w : words){
			if(w.equals("dhanya")){
				System.out.println("print she is in USA");
			}
		}
		
		String name = "sriramakrishna";
		System.out.println(name.substring(3, 7));
		System.out.println(name.length());
		System.out.println(name.lastIndexOf("s"));
		
		
		
		ArrayList<String> things = new ArrayList<>();
		
	*/
		

	}


public void go() {
	// TODO Auto-generated method stub
	
	
}

}
