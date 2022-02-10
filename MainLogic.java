package com.mondee;
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
	    
	
	    Student s1=new Student(); 
	    //deleted query
//	    s1.setSid(0);
//	   
//	    
	     //Insert Query:
//	    s1.setSid(3);    
//	    s1.setSname("KOTI");    
//	    s1.setSmarks((95));  
//	    
	   //Select Query:
	    s1 = (Student)session.get(Student.class,4);
	    System.out.println("Student Values:");
	    System.out.println("Get the Student Values  "+"SId-->  "+s1.getSid()+"  Sname-->  "+s1.getSname()+"  Smarks-->  "+s1.getSmarks());
	    System.out.println("Student updated Values:"); 
	    
	   

	   // session.delete(s1);  
	    t.commit();  
		session.close();
		//System.out.println("inserted succesfully");

	}

}
