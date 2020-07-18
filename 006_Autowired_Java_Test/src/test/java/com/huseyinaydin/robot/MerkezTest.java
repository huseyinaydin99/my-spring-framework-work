package com.huseyinaydin.robot;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Component
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class MerkezTest {
	@Autowired
	@Qualifier("sariBas")
	/*@Inject
	@Named("sariBas")*/
	private Bas robot;
	
	@Test
	public void enjecteDurumu() {
		robot.olustur();
	}

	public Bas getRobot() {
		return robot;
	}

	public void setRobot(Bas robot) {
		this.robot = robot;
	}

	
	
}
