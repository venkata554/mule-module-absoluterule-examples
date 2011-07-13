package com.democompany.rules.transactionvalidation;

import com.modeltwozero.nrl.java.runtime.rules.ValidationRuleBreak;
import com.modeltwozero.nrl.java.runtime.rules.IValidationRuleBreak;
import com.modeltwozero.nrl.java.runtime.rules.IValidationRule;
import java.util.HashSet;
import com.democompany.models.transactions.Transaction;
import java.util.Set;
import java.math.BigDecimal;

/**
 * This class implements an NRL rule. Include it in a rule set to execute it.
 * <p>
 * <b>Warning:</b> this file was generated using the Absolute Rule code
 * generator. Do not change it, your changes will be lost on regeneration. If
 * you wish to change the class, make a copy.
 * <p>
 * <b>Thread safety:</b> this class is not thread-safe. If you are using this in
 * a multi- threaded application, instantiate one object per thread or use
 * concurrency control.
 */
public class R1 implements IValidationRule {

	final static long serialVersionUID = -3958601175895268295L;

	private Set<String> standingorderEtc;

	public R1() {
		standingorderEtc = new HashSet<String>();
		standingorderEtc.add("STANDINGORDER");
		standingorderEtc.add("BANKFEE");
	}

	public String getId() {
		return "r1";
	}

	public IValidationRuleBreak validate(Object context) throws Exception {
		if (validate((Transaction) context)) {
			return null;
		} else {
			return new ValidationRuleBreak(this, context);
		}
	}

	public Class<?> getContextClass() {
		return Transaction.class;
	}

	public String getContextName() {
		return "Transaction";
	}

	public boolean validate(Transaction context) throws Exception {
		Transaction current = context;
		if (standingorderEtc.contains(current.getType())) {
			return current.getAmount().compareTo(BigDecimal.valueOf(0)) < 0;
		} else {
			return true;
		}
	}
}
