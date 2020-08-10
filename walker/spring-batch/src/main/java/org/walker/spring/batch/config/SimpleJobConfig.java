package org.walker.spring.batch.config;

import java.util.List;
import java.util.Random;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing(modular = true)
public class SimpleJobConfig {

	@Bean
	public Job simpleJob(JobBuilderFactory jobBuilders, StepBuilderFactory stepBuilders) {
		return jobBuilders.get("simpleJob").start(simpleStep(stepBuilders)).build();
		
	}

	private Step simpleStep(StepBuilderFactory stepBuilders) {
		return stepBuilders.get("simpleStep").<Number, String>chunk(2)
				.reader(reader())
				.processor(processor()).writer(writer()).build();
	}

	private ItemWriter<? super String> writer() {
		return new ItemWriter<String>() {

			@Override
			public void write(List<? extends String> items) throws Exception {
				System.out.println(items);
			}
		};
	}

	private ItemProcessor<? super Number, ? extends String> processor() {
		return new ItemProcessor<Number, String>() {

			@Override
			public String process(Number item) throws Exception {
				return item.toString();
			}
		};
	}

	private ItemReader<? extends Number> reader() {
		return new ItemReader<Integer>() {

			@Override
			public Integer read()
					throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
				return Integer.valueOf(new Random().nextInt(100));
			}
		};
	}
	
}
