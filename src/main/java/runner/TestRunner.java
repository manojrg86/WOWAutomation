package runner;

public class TestRunner {

	public static void main(String args[]) throws Throwable{
		TestFactory stories = new TestFactory();
        stories.run();
	}
}
