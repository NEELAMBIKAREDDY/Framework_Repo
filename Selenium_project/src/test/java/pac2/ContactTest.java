package pac2;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createcontactTest()
	{
		System.out.println("execute createcontactTest");
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("Browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
	@Test
	public void modifycontactTest()
	{
		System.out.println("execute modifycontactTest");
	}
	@Test
	public void deletecontactTest()
	{
		System.out.println("execute deletecontactTest");
	}

}
