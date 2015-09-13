package runner;

import java.io.File;
import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

public class TestRunner {

	public static void main(String args[]){
		File testNgXml=new File("testng.xml");
		List<String> runFiles=Lists.newArrayList();
		runFiles.add(testNgXml.getAbsolutePath());
		TestNG testNG = new TestNG();
		testNG.setTestSuites(runFiles);
		testNG.run();
		System.out.println("Suite Completed");
		System.exit(0);
	}
}
