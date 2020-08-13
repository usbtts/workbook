package org.walker.rpn.operator.factory;

import org.walker.rpn.operator.AbstractOperator;
import org.walker.rpn.operator.AddOperator;
import org.walker.rpn.operator.ClearOperator;
import org.walker.rpn.operator.DefaultOperator;
import org.walker.rpn.operator.DivideOperator;
import org.walker.rpn.operator.MultiplyOperator;
import org.walker.rpn.operator.SqrtOperator;
import org.walker.rpn.operator.SubtractOperator;
import org.walker.rpn.operator.UndefinedOperator;
import org.walker.rpn.operator.UndoOperator;
import org.walker.rpn.util.OperandUtil;

public class OperatorFactory {

	public AbstractOperator createOperator(String input, int pos) {
		switch (input) {
		case "+":
			return new AddOperator(input, pos);
		case "-":
			return new SubtractOperator(input, pos);
		case "*":
			return new MultiplyOperator(input, pos);
		case "/":
			return new DivideOperator(input, pos);
		case "sqrt":
			return new SqrtOperator(input, pos);
		case "undo":
			return new UndoOperator(input, pos);
		case "clear":
			return new ClearOperator(input, pos);
		default:
			if (OperandUtil.isNumber(input)) {
				return new DefaultOperator("defalut", input, pos);
			}
			return new UndefinedOperator(input, pos);
		}
	}
}
