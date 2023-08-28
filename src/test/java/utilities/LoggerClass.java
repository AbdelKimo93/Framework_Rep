package utilities;
import org.apache.logging.log4j.*;





public class LoggerClass {

public static Logger myLogger = LogManager.getLogger(LoggerClass.class);
	
	public static void main(String[] args) {

		myLogger.error("DB Connection Error");
		myLogger.debug("This is debug");
		
		
		
	}

}


