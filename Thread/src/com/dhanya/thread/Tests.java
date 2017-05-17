package com.dhanya.thread;

public class Tests implements Runnable  {
	
	
    public static void main(String[] args) throws Exception{
     Tests t = new Tests();
     Thread th = new Thread(t);
     th.start();
     
     th.join();
     System.out.println("s");
     
    	
    	 String message = "Hello!";
    	 synchronized (message) {
    		 
    		 try {
    				message.wait();
    				
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			} 
			
		}
         
         message.notify();
         System.out.println(message);
    }

	@Override
	public void run() {
		for(int i =0; i<3; i++){
			System.out.println(i);
		}
	}	
    
    

}
