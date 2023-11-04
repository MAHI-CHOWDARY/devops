package cse;

import java.util.ResourceBundle;

public class UserValidationn {

	public boolean check(String uname,String pwd)
	 {
		
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String username=rb.getString("username");
		String password=rb.getString("password");
		if(uname.equals(username)&& pwd.equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	 }
}
