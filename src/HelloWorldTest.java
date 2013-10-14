import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class HelloWorldTest {

	HelloWorld hw = new HelloWorld();
		
	@Test
	public void thisIsATestMethod() {
	hw.testmethod1();	
	assertEquals(5, 2 + 3);
	}

}
