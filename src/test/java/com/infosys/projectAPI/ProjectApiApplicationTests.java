import org.junit.Assert;
import org.junit.Test;

public class ProjectApiApplicationTests {

	@Test
	public void basicTest() {
		try {
			Class.forName("com.infosys.projectAPI.ProjectApiApplication");
		} catch(ClassNotFoundException e) {
			Assert.fail("Should create a class called 'ProjectApiApplication'.");
		}
	}
}











//package com.infosys.projectAPI;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//
//class ProjectApiApplicationTests {
//
//	@Test
//	public void basicTest(){
//
//		ProjectApiApplication test = new ProjectApiApplication();
//		assertEquals
//
//	}
//
//}
