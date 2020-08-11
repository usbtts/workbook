package org.walker.calculator.operator.factory;

import org.walker.calculator.operator.AddOperator;
import org.walker.calculator.operator.DefaultOperator;
import org.walker.calculator.operator.DivideOperator;
import org.walker.calculator.operator.MultiplyOperator;
import org.walker.calculator.operator.Operator;
import org.walker.calculator.operator.SqrtOperator;
import org.walker.calculator.operator.SubtractOperator;
import org.walker.calculator.operator.UndefinedOperator;
import org.walker.calculator.util.OperandUtil;

public class OperatorFactory {

	public Operator createOperator(String input) {
		switch (input) {
		case "+":
			return new AddOperator(input);
		case "-":
			return new SubtractOperator(input);
		case "*":
			return new MultiplyOperator(input);
		case "/":
			return new DivideOperator(input);
		case "sqrt":
			return new SqrtOperator(input);
		default:
			if (OperandUtil.isNumber(input)) {
				return new DefaultOperator("defalut", input);
			}
			return new UndefinedOperator(input);
		}
	}
}
