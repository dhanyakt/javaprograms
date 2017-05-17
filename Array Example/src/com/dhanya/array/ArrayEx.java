package com.dhanya.array;

public class ArrayEx {
	transient int x;
	

	public static void main(String[] elephant) {
		 int anar[]=new int[]{1,2,3};
         System.out.println(anar[1]); 
         byte arr[] = new byte[3];
         System.out.println(arr[0]);
         float flags[] = new float[3];
         System.out.println(flags[0]);
         
         String[] s = new String[3];
         System.out.println(s[0]);
         
         Integer ten=new Integer(10); 
         Long nine=new Long (9);
         System.out.println(ten + nine); 
         int i=1;
         System.out.println(i + ten);
         
         
         String s1=new String("Bicycle"); 
         int iBegin=1; 
         char iEnd=3; 
         System.out.println(s1.substring(iBegin,iEnd) + " " + s1.indexOf("y"));
         
         System.out.println(4 | 3);
         
         
         String one = "Java";
         String two = "java";
         if(one.equalsIgnoreCase(two)){
        	 System.out.println("Equal");
         }
         
        

	}

}
