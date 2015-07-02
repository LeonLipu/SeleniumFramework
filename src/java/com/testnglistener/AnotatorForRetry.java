package testnglistener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class AnotatorForRetry implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {
		
		IRetryAnalyzer ira=annotation.getRetryAnalyzer();
		if(ira==null)
			annotation.setRetryAnalyzer(Retrylistener.class);
		// TODO Auto-generated method stub
		
	}

}
