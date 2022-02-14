package com.mondee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestInheritance {
	public static void main(String[] args) {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.xml").build();  
		    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		    Session session = factory.openSession();  
		    Transaction t = session.beginTransaction();
		Project p=new Project();
		p.setProjectName("Hibernate Lessions");
		Module  m=new Module();
		m.setProjectName("Spring");
		m.setModuleName("Aop");
		Task t1=new Task();
		t1.setProjectName("collections");
		t1.setModuleName("arraylist");
		t1.setTaskName("java programs");
		session.save(p);
		session.save(m);
		session.save(t1);
		t.commit();
		session.close();
		
	}
}
