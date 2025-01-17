import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailUnitTestCase {

	@Test
	void test() {
		EmailValidation ev=new EmailValidation();
		boolean res=EmailValidation.Regex("anasahmed97@gmail.com");
		
		assertEquals("email is valid",res);
	
	
	}

}
