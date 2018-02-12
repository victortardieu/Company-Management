package company;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnit_test_company {

	@Test
	public void test_name() {
		Employees employee1 = new Employees(123, "Victor", "CEO", 1);
		assertEquals("Victor", employee1.getName());
	}
	
	public void test_position() {	
		Administrators employee3 = new Administrators(789, "Fil", "Marketing Director", 3, 1);
		assertEquals("Marketing Director", employee3.getPosition()); 
	}
	
	public void test_happiness() {
		Researchers employee4 = new Researchers(015, "Chris", "CTO", 4, "Dr", "Java/C++");
		employee4.setHappiness(true);
		assertTrue(employee4.isHappy());
	}

}
