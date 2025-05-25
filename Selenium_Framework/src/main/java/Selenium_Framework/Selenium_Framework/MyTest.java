package Selenium_Framework.Selenium_Framework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTest {
	@Test
	public void test1()
	{
		System.out.println("This is test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("This is test 2");
	}
	@Test
	public void test3()
	{
		System.out.println("This is test 3");
	}
	@Test
	public void test4()
	{
		System.out.println("This is test 4");
	}
	@BeforeMethod
	public void test5()
	{
		System.out.println("This is test 5");
	}

}
