package org.walker.rpn.operator.factory;

import org.walker.rpn.operator.AddOperator;
import org.walker.rpn.operator.DefaultOperator;
import org.walker.rpn.operator.DivideOperator;
import org.walker.rpn.operator.MultiplyOperator;
import org.walker.rpn.operator.Operator;
import org.walker.rpn.operator.SqrtOperator;
import org.walker.rpn.operator.SubtractOperator;
import org.walker.rpn.operator.UndefinedOperator;
import org.walker.rpn.util.OperandUtil;

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
