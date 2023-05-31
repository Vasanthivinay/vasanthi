package runner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency1 
{@Test


	public void test1()
{
	System.out.println("fist tc");
	}
@Test
public void test2()
{
	System.out.println("second tc");
Assert.fail();
}
@Test
public void test3()
{
	System.out.println("third tc");
}

}

