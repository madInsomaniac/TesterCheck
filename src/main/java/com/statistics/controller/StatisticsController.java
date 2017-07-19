package com.statistics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.statistics.repo.TransactionDao;

@Controller
@RequestMapping("/stats/")
public class StatisticsController {
	
	@Autowired
    private TransactionDao transactiondao;

}
