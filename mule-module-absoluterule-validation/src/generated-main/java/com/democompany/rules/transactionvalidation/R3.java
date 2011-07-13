package com.democompany.rules.transactionvalidation;

import com.modeltwozero.nrl.java.runtime.rules.ValidationRuleBreak;
import com.democompany.models.transactions.Transactions;
import com.modeltwozero.nrl.java.runtime.rules.IValidationRuleBreak;
import com.modeltwozero.nrl.java.runtime.rules.IValidationRule;
import java.util.List;
import com.democompany.models.transactions.Transaction;

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
public class R3 implements IValidationRule {

	final static long serialVersionUID = -977412260326473433L;

	public R3() {
	}

	public String getId() {
		return "r3";
	}

	public IValidationRuleBreak validate(Object context) throws Exception {
		if (validate((Transactions) context)) {
			return null;
		} else {
			return new ValidationRuleBreak(this, context);
		}
	}

	public Class<?> getContextClass() {
		return Transactions.class;
	}

	public String getContextName() {
		return "Transactions";
	}

	public boolean validate(Transactions context) throws Exception {
		Transactions current = context;
		return allTransactionConditionA(context, current.getTransaction());
	}

	protected boolean allTransactionConditionA(Transactions context,
			List<?> target) {
		for (int i = 0; i < target.size(); i++) {
			Transaction transaction = (Transaction) target.get(i);
			if (!(transaction
					.getDate()
					.toGregorianCalendar()
					.getTime()
					.compareTo(
							context.getStatementDate().toGregorianCalendar()
									.getTime()) <= 0))
				return false;
		}
		return true;
	}
}
