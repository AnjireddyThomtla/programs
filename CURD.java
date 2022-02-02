import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;
import com.mysql.cj.xdevapi.Statement;
import java.io.*;
public class CURD {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try{
		String url="jdbc:mysql://localhost:3306/Anji";
		String username="root";
		String password="Anji@123";
		Connection connection=DriverManager.getConnection(url,username,password);
		java.sql.Statement st = connection.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Y/N");
		 char c=sc.next().charAt(0);
		 while(c=='Y') {
		System.out.println("Enter the number");
		int n=sc.nextInt();
		while(n>0) {
			System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the name");
	String name=sc.next();
		System.out.println("Enter the salary");
		int salary=sc.nextInt();
		System.out.println("Enter the dept");
		String dept=sc.next();
		if(n==1) {
		PreparedStatement stmt=connection.prepareStatement("insert into Employee Values(?,?,?,?)");
		stmt.setInt(1,id);
		stmt.setString(2, name);
		stmt.setInt(3, salary);
		stmt.setString(4, dept);
		int i=stmt.executeUpdate();
		System.out.println("Record inserted");
		}
			 if(n==2) {
		ResultSet result = st.executeQuery("select * from Employee");
while (result.next())
        {
             System.out.println (result.getInt(1)+" "+
             result.getString(2)+" "+
             result.getString(3)+" "+
             result.getString(4));
        }
       }
			else if(n==3) {
		PreparedStatement stmt1=connection.prepareStatement("delete from Employee Where id=?");
		System.out.println("Enter Deleted id");
		id=sc.nextInt();
		stmt1.setInt(1, id);
		int i1=stmt1.executeUpdate();
		System.out.println(i1+"record deleted");
		}
			else if(n==4) {
		PreparedStatement stmt2=connection.prepareStatement("update Employee set Ename=? where id=?");
		System.out.println("Enter the  update wanted id");
		id=sc.nextInt();
		System.out.println("Enter the updated name");
		name=sc.next();
		stmt2.setInt(2, id);
		stmt2.setString(1, name);
		int i2=stmt2.executeUpdate();
		System.out.println(i2+" records updated");  
	}
			else {
				System.out.println("Completed");
			}
			break;}
		
		break;}
		 connection.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
		}
}