package org.walker.rpn.operator.factory;

import java.math.BigDecimal;

import org.walker.rpn.operator.AddOperator;
import org.walker.rpn.operator.Operator;

public class OperatorFactory extends AbstractOperatorFactory {
	
	@Override
	public Operator createAddOperator(String sign, BigDecimal addend, BigDecimal augend) {
		return new AddOperator(sign, addend, augend);
	}

	public static volatile OperatorFactory instance;
	
	private OperatorFactory() {
		
	}
	
	public static OperatorFactory getInstance() {
		if (instance == null) {
			synchronized (OperatorFactory.class) {
				instance = new OperatorFactory();
			}
		}
		
		return instance;
	}
}
