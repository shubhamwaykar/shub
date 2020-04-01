package log4jPackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logger4j {
	
	private static final Logger LOG = LogManager.getLogger(Logger4j.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LOG.debug("This is a debug statement");
        LOG.info("This is Info Log");
        LOG.warn("This is Warn Log");
        LOG.error("This is Error Log", new NullPointerException());
        LOG.fatal("This is Fatal Log");
        LOG.trace("This is trace Log");
		
		System.out.println("\n  completed");
	}
	

}
