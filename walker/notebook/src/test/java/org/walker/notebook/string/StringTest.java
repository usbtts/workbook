package org.walker.notebook.string;

import java.nio.charset.Charset;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class StringTest {

	@Test
	public void testSplit() {
		
		String str = "test";
		char english = 'c';
		char chinese = '中';
		System.out.println("s".getBytes().length);
		System.out.println("中".getBytes().length);
		
		System.out.println("s".getBytes(Charset.forName("UTF-8")).length);
		System.out.println("中".getBytes(Charset.forName("UTF-8")).length);
		
		System.out.println("s".getBytes(Charset.forName("UTF-16")).length);
		System.out.println("中".getBytes(Charset.forName("UTF-16")).length);
		
		System.out.println("s".getBytes(Charset.forName("GBK")).length);
		System.out.println("中".getBytes(Charset.forName("GBK")).length);
		
		System.out.println(Arrays.toString(str.split("")));
	}
}
