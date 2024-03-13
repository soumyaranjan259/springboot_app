package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("disel")
@Lazy
public final class DiselEngine implements IEngine {
	public DiselEngine() {
		System.out.println(" DiselEngine: 0-ParamConstructor");
	}

	@Override
	public void start() {
		System.out.println("DiselEngine.start(): DiselEngine is started");

	}

	@Override
	public void stop() {
		System.out.println("DiselEngine.stop(): DiselEngine is Stoped");

	}

}
