package com.mondee;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainLogic {
	public static void main(String[] args) {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.xml").build();  
		    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		    Session session = factory.openSession();  
		    Transaction t = session.beginTransaction();
		    
		    Vendor v=new Vendor();
		    v.setId(103);
		    v.setName("flipcart");
		    
		    Customers c1=new Customers();
		    c1.setCustomerId(125);
		    c1.setCustomerName("arun");
		    
		    Customers c2=new Customers();
		    c2.setCustomerId(126);
		    c2.setCustomerName("ardhik");
		    
		   
		    
		    Set s=new HashSet();
		    s.add(c1);
		    s.add(c2);
		    
		    
		    v.setObj(s);
		    
		    
		    session.save(v);
		    t.commit();
		    session.close();
		    }
}
