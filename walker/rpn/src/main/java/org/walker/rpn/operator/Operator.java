package org.walker.rpn.operator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public interface Operator {
	
	public List<String> operators = Arrays.asList(new String[] { "+", "-", "*", "/" });
	
	public BigDecimal compute();
}
