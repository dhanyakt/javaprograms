package com.dhanya.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) {
		
		
		try {
			test();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	private static void test() throws IOException {
		PrintWriter writer = new PrintWriter(new PrintWriter("yo.txt"));
		writer.print("yo");
		writer.flush();
		writer.close();
		}

}
