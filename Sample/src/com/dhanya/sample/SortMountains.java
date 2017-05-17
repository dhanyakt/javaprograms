package com.dhanya.sample;

import java.util.*;

public class SortMountains{
	
	LinkedList<Mountain>mtn = new LinkedList<Mountain>();
	
	
	class NameCompare implements Comparator<Mountain>{

		@Override
		public int compare(Mountain one, Mountain two) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
	class Mountain{
		String name;
		int height;
		
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getHeight() {
			return height;
		}
		
		public void setHeight(int height) {
			this.height = height;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Mountain [name=" + name + ", height=" + height + "]";
		}
		
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SortMountains().go();

	}

	public void go() {
		Mountain mtn = new Mountain();
		mtn.setHeight(14255);
		mtn.setName("Longs");
		Mountain mtn1 = new Mountain();
		
	
		
		
	}
	

}
