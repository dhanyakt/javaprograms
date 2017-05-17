package com.dhanya.serilization.testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.dhanya.serilization.Animal;
import com.dhanya.serilization.Dog;
import com.dhanya.serilization.Horse;

public class Test {

	public static void main(String[] args) {
		
		Horse h = new Horse(32,"Fido");
		h.go();
		Animal a = new Animal();
		System.out.println("before:"  + h);
		
		try{
			FileOutputStream fso = new FileOutputStream("testSer.ser");
			ObjectOutputStream oso = new ObjectOutputStream(fso);
			oso.writeObject(h);
			oso.close();
		}
		 catch(Exception e){
			 e.printStackTrace();
		 }
		try{
			FileInputStream fsi = new FileInputStream("testSer.ser");
			ObjectInputStream osi = new ObjectInputStream(fsi);
			h=(Horse) osi.readObject();
			System.out.println("after:" + h);
			osi.close();
			h.go();
		}
		 catch(Exception e){
			 e.printStackTrace();
		 }
		
	

	}

}
