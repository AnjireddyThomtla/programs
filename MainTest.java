package com.mondee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainTest {
	public static void main(String[] args) {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.xml").build();  
		    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		    Session session = factory.openSession();  
		    Transaction t = session.beginTransaction();
		    
		    SoftEmployee se=new SoftEmployee();
		    se.setSofName("AnjiReddy");
		   
		   Project p1=new Project();
		    p1.setProName("TripPro");
		   // p.setProname("Make my Trip");
		   se.getPro().add();
		    session.save(p);
		    t.commit();
		    session.close();
	}
}
