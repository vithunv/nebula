package com.varnam.nebula.accounting.accountingmanager.entity;

import java.text.DecimalFormat;
import java.util.Currency;

import javax.persistence.Id;

public class AccountEntity {
	@Id
	private String accountId;
	private Currency currentBalance;
	
}
