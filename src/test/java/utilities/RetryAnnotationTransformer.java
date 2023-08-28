package utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import iListeners.RetryListeners;

public class RetryAnnotationTransformer implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method tesMethod ) {
		
		annotation.setRetryAnalyzer(RetryListeners.class);
	}
	
}
