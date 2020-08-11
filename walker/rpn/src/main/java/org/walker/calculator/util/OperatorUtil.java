package org.walker.calculator.util;

import java.util.Arrays;
import java.util.List;

public class OperatorUtil {
	
	private static List<String> operators = Arrays.asList(new String[] {"default", "+", "-", "*", "/", "sqrt", "undo", "clear"});
	
	public static boolean isOperator(String sign) {
		return operators.contains(sign);
	}
}
