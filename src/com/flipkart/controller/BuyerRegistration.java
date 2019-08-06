/* Business class for Buyer Information. This class stores registration information in Database
 * 
 * status = 0 :: success
 * status = 1 :: User name already exist
 * status = 2 :: Email Id already exist
 * status = 3 :: Server side error
 * 
 */


package com.flipkart.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.flipkart.model.BuyerBean;

public class BuyerRegistration {
	
	private String userName, name, email, password, dOB;
	private int status = 0;
	public int saveBuyerInformation(BuyerBean user)
	{
		try 
		{
			userName = user.getUserName();
			name = user.getName();
			email = user.getEmail();
			password = user.getPassword();
			dOB = user.getDOB();
			
			//Database Connection
			String url = "jdbc:mysql://127.0.0.1:3306/Flipkart?useSSL=false";
	        String duser = "ooad";
	        String dpassword = "ooad";
	        Class.forName("com.mysql.jdbc.Driver"); 
	        Connection con = DriverManager.getConnection(url, duser, dpassword);
	        
	        //Query for checking user name already exist or not.
	        String query1 = "SELECT * FROM Flipkart.BUYER_INFORMATION WHERE(`USER_NAME`=?) ;";
	        PreparedStatement preparedStmt1 = con.prepareStatement(query1);
	        preparedStmt1.setString(1, userName);
	        
	        //Query for checking email id already exist or not.
	        String query2 = "SELECT * FROM Flipkart.BUYER_INFORMATION WHERE(`EMAIL`=?) ;";
	        PreparedStatement preparedStmt2 = con.prepareStatement(query2);
	        preparedStmt2.setString(1, email);
	        
	        if(preparedStmt1.executeQuery().next())//Checking user name.
	        	status = 1;
	        else if(preparedStmt2.executeQuery().next())//Checking Mail Id.
	        	status = 2;
	        else //If user name and Mail Id not same then add information to the database.
	        {
	        	String query3 = "INSERT INTO `Flipkart`.`BUYER_INFORMATION` (`USER_NAME`, `NAME`, `EMAIL`, `PASSWORD`, `DOB`) VALUES (?,?,?,?,?);";
	        	System.out.println(query3);
		        PreparedStatement preparedStmt3 = con.prepareStatement(query3);
		        preparedStmt3.setString(1,userName);
		        preparedStmt3.setString(2,name);
		        preparedStmt3.setString(3,email);
		        preparedStmt3.setString(4,password);
		        preparedStmt3.setString(5,dOB);		        
		        preparedStmt3.executeUpdate();
	        }
		}
		catch(Exception e)
		{
			System.out.println(e);
			status = 3;
		}
        return status;
	}
	
}
