package com.src;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.jdbc.JDBCAppender;

public class Log4jMethod{
    private static Logger logger = Logger.getLogger(Log4jMethod.class);
	public static void main(String[] args) throws IOException{
		Layout layout = new PatternLayout("%d - %C from %M %m %n");
		Layout layout1 = new SimpleLayout();
		Appender appender = new ConsoleAppender(layout);
		Appender appender1 = new FileAppender(layout1, "D:\\HclJava\\02-09-2021.log");
		Appender appender2 = new JDBCAppender();
		logger.addAppender(appender);
		logger.addAppender(appender1);
		logger.addAppender(appender2);
		logger.debug("Error is debugged");
		logger.info("Information displayed");
		logger.warn("Warning shown");
		logger.error("Error corrected");
		logger.fatal("Fatal mistake");
		
	}

}
