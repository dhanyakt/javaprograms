package com.example.firstapplication;

public class PlayerPiece extends GameShape implements Animate{

	

	@Override
	public void animate() {
		System.out.println("Its animating");
		
	}
	
	public void goTest(){
		System.out.println("Its goTest");
	}

	@Override
	public void doShapes() {
		// TODO Auto-generated method stub
		//super.doShapes();
		System.out.println("Its the player piece method");
		GameShape gShape = new PlayerPiece();
		PlayerPiece playerPiece = new PlayerPiece();
		try {
			gShape.doShapes();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		playerPiece.doShapes();
		
	}

	@Override
	public void anim(String s) {
		// TODO Auto-generated method stub
		
	}
	
	

}
