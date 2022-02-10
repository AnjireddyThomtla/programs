
	package com.mondee;
	import org.hibernate.Session;    
	import org.hibernate.SessionFactory;    
	import org.hibernate.Transaction;  
	import org.hibernate.boot.Metadata;  
	import org.hibernate.boot.MetadataSources;  
	import org.hibernate.boot.registry.StandardServiceRegistry;  
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  

	public class StudentMain {

		public static void main(String[] args) {

			
			Session session = HibernateUtil1.getSessionFactory().openSession();

		    Transaction t = session.beginTransaction();
		    
		
		    Student s1=new Student();    
		    
		      //Insert Query:
		    s1.setSid(3);    
		    s1.setSname("Arjun");    
	    s1.setSmarks(46);  
		    
		    session.save(s1);  
		    t.commit();  
			session.close();

		}

	}

