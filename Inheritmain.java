package com.mondee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Inheritmain {
		public static void main(String[] args) {
			Session se = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = se.beginTransaction();
		    
		    CreditCard cc=new CreditCard();
		    cc.setPaymentId(1024);
		    cc.setAmount(30000);
		    cc.setCreditCardType("visa");
		 
		    
		    Cheque cq=new Cheque();
		    cq.setPaymentId(102);
		    cq.setAmount(25000.00);
		    cq.setChequeType("icici");
		   
		    
		   
		    se.save(cc);
		    se.save(cq);
		    
		    tx.commit();
		    se.close();
	}
}
