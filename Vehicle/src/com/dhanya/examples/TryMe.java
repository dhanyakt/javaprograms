package com.dhanya.examples;

public class TryMe {
    Integer A = 1;
     int a;
     public TryMe(int a) {
         this.a = A + a;
         System.out.print(this.a);
     }
     public static void main(String args[]) {        
         Integer A = new Integer(1);
        TryMe t = new TryMe(A);
     
    }
}