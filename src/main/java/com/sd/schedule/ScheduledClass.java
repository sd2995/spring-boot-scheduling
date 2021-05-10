package com.sd.schedule;

import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledClass {

	private static Logger LOGGER = LogManager.getLogger(ScheduledClass.class);
	
	@Scheduled(initialDelay = 1000, fixedRate = 10000)
	//@Scheduled(cron = "* * * *")
	public void run() {
	    LOGGER.info("Current time is :: " + Calendar.getInstance().getTime());
	}
}
