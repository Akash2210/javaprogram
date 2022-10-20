/* author @akash singh*/

/*Project name : User_Mgt_Project

We will develop below simple basic features in our User Management application:

1.Create a User
2.Update password
3.Delete a User
4.Retrieve a User
5.List of all User
6.Exit


Create Table users : column name ---uname (primary key) , 
password (not null and minimum length should be 6 and should not contain space)

Apply following conditions:

1.While creating user if uname already exists give msg to end user 
that "user alreday exist.Create a unique user name."(create at least five users)

2.While updating ask  user name whose password to be updated.(Uname can't be updated) .

3. in 4th case display uname and password for a perticular user.*/




import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection con;
	public static Connection createConnection() throws Exception
	{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classX","root","Root");
		return con;
		
	}


}
