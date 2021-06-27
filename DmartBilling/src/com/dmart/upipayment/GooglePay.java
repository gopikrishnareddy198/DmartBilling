package com.dmart.upipayment;

import java.awt.List;
import java.util.Random;

public class GooglePay {
	
	private void getReferenceNumber() {
		
	}

	private void getUpiNumber() {
		System.out.println(new Random().nextInt());

	}
	
	private void getHistory() {
		for(int j=0;j<=5;j++) {
			if(j==4)System.out.println(j);
		}
	}
}
