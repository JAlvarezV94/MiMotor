package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Helpers.DBHelper;
import Models.User;

public class UserDAO {

	
	//CRUD
	
	//CREATE
	
	public boolean creatingNewUser(User newUser) {
		boolean isCreated = false;
		String query;
		Connection con;
		Statement stm;
		
		try {
			//STEP 1: Obtaining the connection
			con = DBHelper.getConnection();
			stm = con.createStatement();
			
			//STEP 2: Creating the query
			query = "INSERT INTO users(name,email,pass,level) VALUES('"+newUser.getUsername()+"','"+newUser.getEmail()
			+"','"+newUser.getPass()+"','"+newUser.isAdmin()+"')";
			
			//STEP 3: Executing the query and obtaining the boolean result
			isCreated = stm.execute(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
			isCreated = false;
		}
		
		return isCreated;		
	}
	//READ
	public User readingUser(String username, String pass) {
		String query;
		User user = null;
		Connection con;
		Statement stm;
		ResultSet rs;
		
		try {
			//STEP 1: Obtaining the connection
			con = DBHelper.getConnection();
			stm = con.createStatement();
			
			//STEP 2: Creating the query
			query = "SELECT * FROM users WHERE nmae = '"+username+"' AND pass = '"+pass+"'";
			
			//STEP 3: Executing the query and obtaining the resulset data
			rs = stm.executeQuery(query);
			
			while(rs.next()) {
				user = new User();
				
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setAdmin(rs.getBoolean(5));
			}
		} catch (SQLException e) {
			user = null;
			e.printStackTrace();
		}
		
		return user;		
	}
	
	//UPDATE
	
	//DELETE
}
