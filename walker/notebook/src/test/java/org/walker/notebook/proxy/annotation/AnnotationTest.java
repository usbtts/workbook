package org.walker.notebook.proxy.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;
import org.walker.notebook.annotation.MyAnnotation;

@MyAnnotation(name = "AnnotationTest")
public class AnnotationTest {

	@MyAnnotation(name = "field")
	private String field;
	
	@Test
	@MyAnnotation(name = "test")
	public void test() {
		for (Annotation annotation : this.getClass().getDeclaredAnnotations()) {
			System.out.println(annotation.toString());
		}
		for (Field field : this.getClass().getFields()) {
			for (Annotation annotation : field.getDeclaredAnnotations()) {
				System.out.println(annotation.toString());
			}
		}
	}
	
}
