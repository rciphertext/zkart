/* Java class for verifying login credentials.
 * 
 *  res = JSON object :: user name and password matches.
 *  res = 1 :: Password not matching.
 *  res = 2 :: User name not present in the database.
 *  res = 3 :: Server side Error.
 */

package com.flipkart.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.flipkart.model.LoginBean;

public class Login {
	private String userName,password;
	public int status = 0;
	String res = "";
	
	public String retrieveLoginCredential(LoginBean user)
	{
		userName = user.getUserName();
		password = user.getPassword();
		try 
		{
			//Database Connection
			String url = "jdbc:mysql://127.0.0.1:3306/Flipkart?useSSL=false";
	        String duser = "ooad";
	        String dpassword = "ooad";
	        Class.forName("com.mysql.jdbc.Driver"); 

	        Connection con = DriverManager.getConnection(url, duser, dpassword);
	        System.out.println(con);
	        //Query for checking user name exist or not. If user name exist then it retrieves all the data of that particular user. 
	        String query1 = "SELECT * FROM Flipkart.BUYER_INFORMATION WHERE(`USER_NAME`=?) ;";
	        PreparedStatement preparedStmt1 = con.prepareStatement(query1);
	        preparedStmt1.setString(1, userName);
	        ResultSet rs = preparedStmt1.executeQuery();
	        
	        
	        if(rs.next()) //Checking User name Exist or Not.
	        {
	        	
	        	if(password.equals(rs.getString(5)))//Matching Password
	        	{
	        		res+="{\"userName\":\""+rs.getString(2)+"\",";
	        		res = res+"\"name\":\"" + rs.getString(3)+"\",";
	        		res = res+"\"email\":\"" + rs.getString(4)+"\",";
	        		res = res+"\"password\":\"" + rs.getString(5)+"\",";
	        		res = res+"\"dOB\":\"" + rs.getString(6)+"\"}";
	        	}
	        	else
	        		res = "1";
	        }
	        else
	        	res = "2";      
		}
		catch(Exception e)
		{
			res = "3";
		}
		return res;
	}
}
//456
