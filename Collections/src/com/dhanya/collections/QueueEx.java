package com.dhanya.collections;

import java.util.PriorityQueue;

public class QueueEx {

	public static void main(String[] args) {
		int[] i = {1,5,6,7,8,9};
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int x : i){
			pq.offer(x);
			
			//System.out.println("head of the queue " + pq.poll()+ " ");
		}
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		 PriorityQueue<String> pq1 = new PriorityQueue<String>();
		 pq1.offer("2");
		 pq1.offer("4");
		 System.out.println(pq1.peek());
		 pq1.offer("1");
		 pq1.offer("3");
		 pq1.offer("5");
		 System.out.println(pq1);
		 
	}

}
