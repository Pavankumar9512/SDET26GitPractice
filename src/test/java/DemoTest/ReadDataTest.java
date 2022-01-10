package DemoTest;

import org.testng.annotations.Test;

public class ReadDataTest {

	@Test
	public void readTest()
	{
	
		String BROWSER = System.getProperty("browser");
		String PASSWORD = System.getProperty("password");
		String USERNAME = System.getProperty("username");
		String URL  = System.getProperty("url");
		
		System.out.println(BROWSER);
		System.out.println(PASSWORD);
		System.out.println(USERNAME);
		System.out.println(URL);
		
		
	
	}
}
