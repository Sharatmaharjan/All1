package com.ittraining.bankcreditcard.customer;

public class BankDetails {
	private String bankName;
	private String accountHolderName;
	private long accountNumber;
	protected String getBankName() {
		return bankName;
	}
	protected void setBankName(String bankName) {
		this.bankName = bankName;
	}
	protected String getAccountHolderName() {
		return accountHolderName;
	}
	protected void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	protected long getAccountNumber() {
		return accountNumber;
	}
	protected void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
}
