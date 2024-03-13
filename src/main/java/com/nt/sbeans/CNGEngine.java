package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("cng")
@Lazy
public final class CNGEngine implements IEngine {

	public CNGEngine() {
		System.out.println("CNGEngine: 0-ParamConstructor");
	}

	@Override
	public void start() {
		System.out.println("CNGEngine.start(): CNGEngine is started");

	}

	@Override
	public void stop() {
		System.out.println("CNGEngine.stop(): CNGEngine is Stoped");

	}

}
