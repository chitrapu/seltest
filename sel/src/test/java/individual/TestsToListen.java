package individual;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(individual.TestListerns.class)
public class TestsToListen {
	
	@Test
	public void test1() {
			
		Assert.assertEquals("prakash", "prakash");
	}
	@Test
	public void test2() {
		
		Assert.assertEquals("prakash", "jaffa");
	}

	@Test
	public void test3() {
		
		System.out.println("Test3");
	}


}
