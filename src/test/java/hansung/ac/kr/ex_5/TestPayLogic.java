package hansung.ac.kr.ex_5;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestPayLogic {
	
	Employee emp;
	
	@Before //@Test 메소드가 실행되기 전에 실행되어져야할 부분(메소드)
	public void setUp() {
		emp = new Employee();

		emp.setWorkingHours(100);
		emp.setOvertimeHours(50);
	}

	@Test
	public void testPayLogic1() {

		emp.setPayLogic(new PayLogic1());

		int pay = emp.calculatePay();

		assertEquals(1750, pay);
	}

	@Test
	public void testPayLogic2() {

		emp.setPayLogic(new PayLogic2());

		int pay = emp.calculatePay();

		assertEquals(2000, pay);
	}

}
