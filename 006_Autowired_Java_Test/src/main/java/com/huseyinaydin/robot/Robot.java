package com.huseyinaydin.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("robot")
@Scope("prototype")
public class Robot {
	
	@Autowired
	@Qualifier("kirmiziBas")
	private Bas bas;
	
	public void calistir() {
		bas.olustur();
	}

	public Bas getBas() {
		return bas;
	}

	public void setBas(Bas bas) {
		this.bas = bas;
	}
	
}
