package com.example.firstapplication;

public class GameShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Behaviour 
		PlayerPiece player = new PlayerPiece();
		Object o = player;
		GameShape gShape = player;
		Animate animate = player;
		try {
			gShape.doShapes();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		animate.animate();
		
		System.out.println("Hello Eclipse!!!");
		String text[] = {"Dhanya is learning javascript, Dhanya is doing good!"};
		String myName = "Dhanya";
		String hits[]=new String[text.length];
		for(int i = 0; i< text.length; i++){
			if(text[i].contains(myName)){
				hits[i] =  text[i];	
				System.out.println(hits[i]);
			}
		}
		
		
		// Example of arrays
	String names[]  = {"Sanju", "Dhanya","Teju"};
	for(String item:names){
		if("T".equals(item)){
		   System.out.println("Its correct");
			break;
			}
		}		
	}
	
	public void doShapes() throws Exception {
		System.out.println("playing shapes");
	}

}
