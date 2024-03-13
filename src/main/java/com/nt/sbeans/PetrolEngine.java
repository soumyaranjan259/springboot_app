package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("petrol")
@Lazy
public final class PetrolEngine implements IEngine {
	public PetrolEngine() {
		System.out.println("PetrolEngine: 0-ParamConstructor");
	}

	@Override
	public void start() {
		System.out.println("PetrolEngine.start(): PetrolEngine is started");

	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop(): PetrolEngine is Stoped");

	}

}
