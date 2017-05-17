package com.dhanya.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CreateDirectory {

	public static void main(String[] args) throws IOException {
		File myDir = new File("myDir");
		myDir.mkdir();
		File myFile = new File(myDir, "myFile.txt");
		myFile.createNewFile();
		System.out.println(myDir.isDirectory());
		System.out.println(myFile.isFile());
		FileReader fr = new FileReader(myFile);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s = br.readLine()) != null){
			System.out.println(s);
			br.close();
		}
		
		File delDir = new File("deldir");
		delDir.mkdir();
		 
		

	}

}
