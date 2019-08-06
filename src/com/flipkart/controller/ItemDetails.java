package com.flipkart.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.flipkart.model.*;
public class ItemDetails {
	public int itemId;
	public String retrieveItemDetails(ItemBean item)
	{
		itemId = item.getItem_id();
		String res = "";
		try 
		{
			//Database Connection
			String url = "jdbc:mysql://127.0.0.1:3306/Flipkart?useSSL=false";
	        String duser = "ooad";
	        String dpassword = "ooad";
	        Class.forName("com.mysql.jdbc.Driver"); 
	        Connection con = DriverManager.getConnection(url, duser, dpassword);
	        
	        //Query for checking user name exist or not. If user name exist then it retrieves all the data of that particular user. 
	        String query1 = "SELECT * FROM Flipkart.tbl_item WHERE(`item_id`=?) ;";
	        PreparedStatement preparedStmt1 = con.prepareStatement(query1);
	        preparedStmt1.setInt(1, itemId);
	        ResultSet rs = preparedStmt1.executeQuery();
	        
	        
	        if(rs.next()) //Checking User name Exist or Not.
	        {
	        	if(itemId == rs.getInt(2))//Matching Password
	        	{
	        		res+="{\"item_id\":\""+rs.getInt(2)+"\",";
	        		res = res+"\"name\":\"" + rs.getString(3)+"\",";
	        		res = res+"\"description\":\"" + rs.getString(4)+"\",";
	        		res = res+"\"pic_location\":\"" + rs.getString(5)+"\",";
	        		res = res+"\"seller_id\":\"" + rs.getString(6)+"\",";
	        		res = res+"\"price\":\"" + rs.getInt(7)+"\",";
	        		res = res+"\"discount\":\"" + rs.getInt(8)+"\",";
	        		res = res+"\"cat_id\":\"" + rs.getString(9)+"\",";
	        		res = res+"\"sub_cat_id\":\"" + rs.getString(10)+"\"}";
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
//sdsdsds
//shardul
