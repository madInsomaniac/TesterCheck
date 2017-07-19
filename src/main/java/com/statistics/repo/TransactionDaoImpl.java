package com.statistics.repo;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.statistics.domain.Transaction;

@Repository
@Transactional
public class TransactionDaoImpl implements TransactionDao {

	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public boolean addTransaction(Transaction T) {
		boolean success = false;
		
		Integer id = null;
		id =  (Integer) template.save(T);

		if (id == null) {
			success = false;
		} else {
			success = true;
		}
		
		return success;
	}

}
