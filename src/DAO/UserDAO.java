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
			query = "INSERT INTO users (`name`, `email`, `pass`, `level`) VALUES ('"+newUser.getUsername()+
					"','"+newUser.getEmail()+"','"+newUser.getPass()+"',"+newUser.isAdmin()+")";
			
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
			query = "SELECT * FROM users WHERE email = '"+username+"' AND pass = '"+pass+"'";
			
			//STEP 3: Executing the query and obtaining the resulset data
			rs = stm.executeQuery(query);
			
			while(rs.next()) {
				user = new User();
				
				user.setUsername(rs.getString(2));
			}
		} catch (SQLException e) {
			user = null;
			e.printStackTrace();
		}
		
		return user;		
	}
	
	public boolean userIsExist(User user) {
		String query;
		boolean exists;
		Connection con;
		Statement stm;
		ResultSet rs;
		
		try {
			con = DBHelper.getConnection();
			stm = con.createStatement();
			
			query = "SELECT * FROM users WHERE email = '"+user.getEmail()+"'";
			
			rs = stm.executeQuery(query);
			
			rs.next();
			
			if(rs.getRow() == 0) {
				exists = false;
			}else {
				exists = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			exists = true;
		}
		
		return exists;
	}
	
	//UPDATE
	
	//DELETE
}
