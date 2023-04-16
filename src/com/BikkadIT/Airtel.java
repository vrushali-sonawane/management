package com.BikkadIT;

public class Airtel implements Sim {

	public Airtel() {
		super();
		System.out.println("Airtel class constructor");
	}

	@Override
	public void calling() {
		System.out.println("Calling via Airtel");
	}

	@Override
	public void browse() {
		System.out.println("Browe  via Airtel");
	}

}
