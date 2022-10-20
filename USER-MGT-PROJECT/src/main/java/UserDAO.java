import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class UserDAO 
{
	public static boolean createUser(String uname,String password)
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			PreparedStatement psmt=con.prepareStatement("insert into users(uname,password) values(?,?)");
			psmt.setString(1, uname);
			psmt.setString(2, password);
			psmt.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	//method for updating the password in table users in database
	public static boolean updatePassword(String uname,String newPassword)
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			PreparedStatement psmt=con.prepareStatement("update users  password=(?) where uname=(?)");
			psmt.setString(1,newPassword);
			psmt.setString(2,uname);
			psmt.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	//method for deleting the user from the database
	public static boolean deletionUser(String uname)
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			PreparedStatement psmt=con.prepareStatement("delete from users where uname=(?)");
			psmt.setString(1, uname);
			psmt.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	//retrieving the username and user password from retrieval method
	public static boolean retrievalUser(String uname)
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			PreparedStatement psmt=con.prepareStatement("select uname,password from users where uname=(?)");
			psmt.setString(1, uname);
			ResultSet rest=psmt.executeQuery();
			rest.next();
			System.out.println("The user is : "+rest.getString(1)+" and the password is : "+rest.getString(2));
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	//displaying the complete list of all the users
	public static boolean displayingListOfAllTheUsers()
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select uname from users");
			while(rs.next())
			{
				System.out.println(" uname : "+rs.getString(1));
				System.out.println("#############");
			}
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}