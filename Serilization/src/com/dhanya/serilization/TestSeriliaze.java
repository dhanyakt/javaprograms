package com.dhanya.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSeriliaze {

	public static void main(String[] args) {
		Collar c = new Collar(3);
		Dog d = new Dog(c, 8);
		System.out.println("before:" + d.getTheCollar().getCollarSize());
		try{
			FileOutputStream fso = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fso);
			os.writeObject(d);
			os.close();
		}
		 catch(IOException e){
			 e.printStackTrace();
		 }
		
		try{
			FileInputStream fsi = new FileInputStream("testSer.ser");
			ObjectInputStream osi = new ObjectInputStream(fsi);
			d=(Dog) osi.readObject();
			System.out.println("after:" + d.getTheCollar().getCollarSize());
			osi.close();
		}
		 catch(Exception ex){
			 ex.printStackTrace();
		 }
	}

}
