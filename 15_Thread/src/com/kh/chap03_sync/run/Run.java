package com.kh.chap03_sync.run;

import com.kh.chap03_sync.sync.*;

public class Run {

	public static void main(String[] args) {
		Buffer bf = new Buffer();
		Thread producer = new Producer(bf);
		Thread customer = new Thread(new Customer(bf));
		
		producer.start();
		customer.start();
		
	}

}
