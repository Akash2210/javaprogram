import java.util.Scanner;
public class UserDemo {
	public static void main (String args[])
	{
		while(true)
		{
			System.out.println("Press 1 to Create a User.... :");
			System.out.println("Press 2 to Update password.... :");
			System.out.println("Press 3 to Dleate a User.... :");
			System.out.println("Press 4 to Retrive a User....:");
			System.out.println("Press 5 to list of all User....:");
			System.out.println("Press 6 to  Exit....:");
			
			 Scanner sc=new Scanner(System.in);
			
			int i=sc.nextInt();
			boolean flag;
		
			switch(i)
			{
			
			                case 1:{
							System.out.println("Enter the name to create user: ");
							String uname=sc.next();
							System.out.println("Enter the password of  user: ");
			
							if(true)
							{
						    String password=sc.next();
					
						    if(password.length()>6 && !password.contains(" "))
								{
							flag=UserDAO.createUser(uname,password);
							if(flag)
							System.out.println("successfully create a user .....");
							}
							else
							{
							System.out.println("please enter a valid password.....");
							}
							}
							break;
			                }
			                
			case 2:{
		System.out.println("Enter that name by whose reference the password is updated:");
		String uname=sc.next();
	    System.out.println("Enter new password to update: ");
		String newPassword=sc.next();
		flag=UserDAO.updatePassword(uname,newPassword);
		if(flag)
		System.out.println("Successfully updated Password....");
		else
		System.out.println("Not successfully update Password.....");
							
		break;
			   }
	
			                case 3:{
							System.out.println("Enter user name to delete the user");
							String uname=sc.next();
							flag=UserDAO.deletionUser(uname);
							if(flag)
								System.out.println("User deleted successfully.....");
							else
								System.out.println("problem occured while deleting the user.....");
							
							  break;
			                   }
			                
			case 4:{
			System.out.println("Enter name to Retrive a user");
			String uname=sc.next();
			flag=UserDAO.retrievalUser(uname);
			if(flag)
			System.out.println("User retrival and password is successful......");
			else
		    System.out.println("problem occured during retrival user name and password .....");
								
			break;
			  }
			
			                case 5:{
							System.out.println("displaying the list of all the users");
							flag=UserDAO.displayingListOfAllTheUsers();
							if(flag)
								System.out.println("displaying list of User successfull....");
								System.out.println("Not displaying Successful the list of User....");
							
							    break;
			                    }
			                
			case 6:{
			System.out.println("Bye Bye....");
			flag=false;
			 }
			
			break;
			
			default: {
			System.out.println("Please enter a valid no......");
			}
			}
		    }
		    }
            }