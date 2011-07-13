package com.democompany.rules.transactionvalidation;

import com.modeltwozero.nrl.java.runtime.rules.AbstractRuleSet;

/**
 * This class implements an NRL rule set. Pass it to the NRL Java runtime to
 * execute it, or call it directly.
 * <p>
 * <b>Warning:</b> this file was generated using the Absolute Rule code
 * generator. Do not change it, your changes will be lost on regeneration. If
 * you wish to change the class, make a copy.
 * <p>
 * <b>Thread safety:</b> this class is not thread-safe. If you are using this in
 * a multi- threaded application, instantiate one object per thread or use
 * concurrency control.
 */
public class RuleSetTransactionRules extends AbstractRuleSet {

	final static long serialVersionUID = -6336262300515279673L;

	public RuleSetTransactionRules() {
		addRule(new R1());
		addRule(new R2());
		addRule(new R3());
	}

	public boolean hasPrecondition() {
		return false;
	}

	public boolean isPreconditionSatisfied(Object context) {
		return true;
	}

	public String getContextName() {
		return null;
	}

	public Class<?> getContextClass() {
		return null;
	}

	public String getId() {
		return "Transaction Rules";
	}
}
