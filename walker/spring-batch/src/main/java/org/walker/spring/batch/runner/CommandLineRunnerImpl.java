package org.walker.spring.batch.runner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Job simpleJob;
	
	@Autowired
	private JobLauncher jobLauncher;
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("Running from command line runner");
		jobLauncher.run(simpleJob, new JobParametersBuilder().addString("EOD", LocalDate.now().format(DateTimeFormatter.ISO_DATE)).toJobParameters());
	}

}
