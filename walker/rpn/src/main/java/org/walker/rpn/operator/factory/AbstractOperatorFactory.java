package org.walker.rpn.operator.factory;

import java.math.BigDecimal;

import org.walker.rpn.operator.Operator;

public abstract class AbstractOperatorFactory {
	public abstract Operator createAddOperator(String sign, BigDecimal addend, BigDecimal augend);
}
