package com.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.statistics.domain.Transaction;
import com.statistics.repo.TransactionDao;

@Service
public class TransactionService {

	@Autowired
	private TransactionDao transactiondao;
	
	public void addTransation(double amount, Long timestamp){
		
		Transaction T = new Transaction();
		T.setAmount(amount);
		T.setTimestamp(timestamp);
		boolean success=transactiondao.addTransaction(T);

		if(success){
			
		}
		else{
			
		}
		
	}
}
