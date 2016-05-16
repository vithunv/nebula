package com.varnam.nebula.accounting.accountingmanager.entity;

import java.math.BigDecimal;
import java.util.Currency;

public class TransactionEntity {
	public static enum TransctionType {
		DEBIT, CREDIT
	}

	private AccountEntity account;
	private long sequence;
	private BigDecimal amount;

	public AccountEntity getAccount() {
		return account;
	}

	public void setAccount(AccountEntity account) {
		this.account = account;
	}

	public long getSequence() {
		return sequence;
	}

	public void setSequence(long sequence) {
		this.sequence = sequence;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public TransctionType getTransactionType() {
		return this.amount.compareTo(BigDecimal.ZERO) >= 0 ?
				TransctionType.CREDIT : TransctionType.DEBIT;
	}

}
