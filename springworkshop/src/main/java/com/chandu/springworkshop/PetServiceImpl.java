package com.chandu.springworkshop;

public class PetServiceImpl {

	AccountDao accountDao;
	
	
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	void show() {
		accountDao.printAccount();
	}
	
	
}
