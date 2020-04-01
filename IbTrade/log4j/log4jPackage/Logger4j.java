package log4jPackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logger4j {
	
	private static Logger Logger = LogManager.getLogger(Logger4j.class);
	
	public static void main (String[] args) {
		
		System.out.println("\n  IBtrade Project....!   \n");
		
		Logger.trace("This is trace message");
		Logger.info("This is information message");
		Logger.error("This is an arror message");
		Logger.warn("This is warning message");
		Logger.fatal("This is a fatal message");
		
		System.out.println("\n  completed");
	}
	

}
