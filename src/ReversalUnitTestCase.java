import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReversalUnitTestCase {

	@Test
	void test() {
     Reversal r=new Reversal();
   String res=  r.reversal("ahmed");
   assertEquals("demha ", res);
	}

}
