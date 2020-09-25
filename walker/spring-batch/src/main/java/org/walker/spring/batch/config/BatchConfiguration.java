package org.walker.spring.batch.config;

import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.walker.spring.batch.entity.Person;

@Configuration
public class BatchConfiguration {

	@Autowired
	private JobBuilderFactory jobBuilder;
	
	@Autowired
	private StepBuilderFactory stepBuilder;
	
	@Bean
	public Job simpleJob(Step simpleStep) {
		return jobBuilder.get("simpleJob")
				.flow(simpleStep)
				.end()
				.build();
	}
	
	@Bean
	public Step simpleStep(ItemReader<Person> reader, ItemProcessor<Person, String> processor, ItemWriter<String> writer) {
		return stepBuilder.get("simpleStep")
				.<Person, String>chunk(10)
				.reader(reader)
				.processor(processor)
				.writer(writer).build();
	}
	
	@Bean
	@StepScope
	public FlatFileItemReader<Person> reader(@Value("#{jobParameters['EOD']}") String EOD) {
		return new FlatFileItemReaderBuilder<Person>()
			    .name("personItemReader")
			    .resource(new ClassPathResource("simpleJobInput-2020-08-25.txt"))
			    .delimited()
			    .names(new String[]{"firstName", "lastName"})
			    .fieldSetMapper(new BeanWrapperFieldSetMapper<Person>() {{
			      setTargetType(Person.class);
			    }})
			    .build();
	}
	
	@Bean
	@StepScope
	public ItemProcessor<Person, String> processor() {
		return new ItemProcessor<Person, String>() {

			@Override
			public String process(Person item) throws Exception {
				return item + " processed";
			}
		};
	}
	
	@Bean
	@StepScope
	public ItemWriter<String> writer() {
		return new ItemWriter<String>() {

			@Override
			public void write(List<? extends String> items) throws Exception {
				items.stream().forEach(item -> System.out.println(item));;
			}
		};
	}
	
}
