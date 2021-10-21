


import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class ZooTest2 {

	@Test
	public void unTest()  {
		zoo zoo1 = new zoo();
		String expectedMessage = "Nombre de visiteur max atteint";

		for (int i =0 ; i < 20; i++) {
			try {
				zoo1.nouveauVisiteur();
			} catch (LimiteVisiteurException e) {
				String actualMessage = e.getMessage();
			    assertTrue(actualMessage.contains(expectedMessage));

				e.printStackTrace();
			}
		}

	    


    }
}
