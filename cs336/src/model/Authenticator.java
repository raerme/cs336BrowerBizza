package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Authenticator {
	
	public String createAccount(String username, String password, String fname, String lname) {
		try {
			String url = "jdbc:mysql://cs336browerbizzaprojinstance.choekbfyb9st.us-east-1.rds.amazonaws.com:3306/cs336proj";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "cs336", "browerbizza");
			Statement stmt = con.createStatement();
			String insertNewAccount = "INSERT INTO Users(fname, lname, username, password)"+ 
									" VALUES ('" + fname + "', '" + lname + "', '" + username + "', '" + password + "');";
			stmt.executeUpdate(insertNewAccount);
			con.close();
		} catch (Exception e) {
			return "failed";
		}
		return "success";
	}
	
	public String loginAuthenticator(String username, String password) {
		try {
			String url = "jdbc:mysql://cs336browerbizzaprojinstance.choekbfyb9st.us-east-1.rds.amazonaws.com:3306/cs336proj";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "cs336", "browerbizza");
			Statement stmt = con.createStatement();
			String str = "SELECT * FROM Users WHERE Username = '" + username + "' AND Password = '" + password + "';";
			ResultSet result = stmt.executeQuery(str);
			if(result.isBeforeFirst() == false) {
				con.close();
				return "fail";
			}
		}catch (Exception e) {
			return "fail";
		}
		return "success";
	}

}
