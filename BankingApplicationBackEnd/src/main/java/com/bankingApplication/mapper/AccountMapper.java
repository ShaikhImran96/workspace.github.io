package com.bankingApplication.mapper;

import com.bankingApplication.dto.AccountDto;
import com.bankingApplication.entity.Account;

public class AccountMapper {

	
	public static Account  mapAccount(AccountDto accountDto) {
		
		Account account=new Account(
				
				accountDto.getId(),
				accountDto.getAccountHolderName(),
				accountDto.getBalance()
				);
		return account;
	}
	
	public static AccountDto mapToAccountDto(Account account) {
		
		AccountDto accountDto=new AccountDto(
				
				account.getId(),
				account.getAccountHolderName(),
				account.getBalance()
				
				);
					
			return accountDto;		
	}
}
