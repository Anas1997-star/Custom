import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTesting {

	@Test
	void test() {
		PrimeTest t1=new PrimeTest();
		int result=t1.work(4);

		assertEquals(6,result);	
		}

}
