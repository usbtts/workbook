package org.walker.spring.batch;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableBatchProcessing
@EnableScheduling
public class SpringBootBatchApplication 
{
	
	private static Logger logger = LoggerFactory.getLogger(SpringBootBatchApplication.class);
	
	@Autowired
	private Job simpleJob;
	
	@Autowired
	private JobLauncher jobLauncher;
	
	@Autowired
	private JobRepository jobRepository;
	
	@Autowired
	private JobRegistry jobRegistry;
	
    public static void main( String[] args )
    {
    	logger.info("Start application at {}", System.currentTimeMillis());
        SpringApplication.run(SpringBootBatchApplication.class, args);
    }
    
    @Scheduled(cron ="1/2 * * * * ?")
    public void runSimpleJob() throws Exception {
    	logger.info("running from scheduler");
    	jobLauncher.run(simpleJob, new JobParametersBuilder().addString("EOD", LocalDate.now().format(DateTimeFormatter.ISO_DATE)).toJobParameters());
    }
}
