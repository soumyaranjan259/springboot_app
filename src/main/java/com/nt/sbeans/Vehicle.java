package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {
	@Autowired
	@Qualifier("cng")

	private IEngine engine;

	public Vehicle() {
		System.out.println("Vehicle: 0-ParamConstructor");
	}

	public void journey(String start, String end) {
		System.out.println("Vehicle.Journey()");

		engine.start();
		System.out.println("Vehicle.journey started from: " + start);

		System.out.println("Vehicle journey is going on...");

		engine.stop();
		System.out.println("vehicle journey end at: " + end);
	}
}
