import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JdbcFirst {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Anji";
		String username="root";
		String password="Anji@123";
		Connection connection=DriverManager.getConnection(url,username,password);
		if(connection!=null)
			System.out.println("connection Established");

	}

}