package org.walker.spring.batch;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.NoSuchJobException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBatchApplication 
{
	public static final Logger logger = LoggerFactory.getLogger(SpringBatchApplication.class);
	
    public static void main( String[] args )
    {
        try {
        	ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootApplication.class, args);
        	JobRegistry registry = ctx.getBean(JobRegistry.class);
        	JobLauncher launcher = ctx.getBean(JobLauncher.class);
			Job job = registry.getJob(args[0]);
			JobExecution execution = launcher.run(job, new JobParametersBuilder().addDate("date", new Date()).toJobParameters());
			logger.info("Job {}	", "simpleJob");
		} catch (NoSuchJobException e) {
			e.printStackTrace();
		} catch (JobExecutionAlreadyRunningException e) {
			e.printStackTrace();
		} catch (JobRestartException e) {
			e.printStackTrace();
		} catch (JobInstanceAlreadyCompleteException e) {
			e.printStackTrace();
		} catch (JobParametersInvalidException e) {
			e.printStackTrace();
		}
        
    }
}
