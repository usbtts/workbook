package org.walker.rpn.util;

import java.math.BigDecimal;

public class OperandUtil {
	public static boolean isNumber(String operand) {
		try {
			new BigDecimal(operand);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
