package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Helpers.DBHelper;
import Models.Motorbike;

public class MotorbikeDAO {

	//CRUD
	
	//CREATE
	
	public boolean newMotorbike(Motorbike newMotorbike) {
		boolean isCreated = false;
		int id = 0;
		Statement stm;
		Connection con;
		ResultSet rs;
		String query;
		
		try {
			//STEP 1: Getting the connection with the DB
			con = DBHelper.getConnection();
			stm = con.createStatement();
			
			//STEP 2: Creating the query to the 'motorbikes' table
			query = "INSERT INTO motorbikes (modelo,marca,color,tipo,precio) VALUES('"+newMotorbike.getModel()+"','"+newMotorbike.getTrademark()+"','"+newMotorbike.getColor()+"','"+
			newMotorbike.getType()+"',"+newMotorbike.getPrice()+")";
			
			//STEP 3: Executing the the query
			isCreated = stm.execute(query);
			
			//STEP 4: If the new motorbike has been created, getting the id number from this table and write a new query for 'descriptions' table
			if(isCreated) {
				//STEP 4.1: Creating the query
				query = "SELECT id FROM motorbikes WHERE modelo = '"+newMotorbike.getModel()+"' AND marca = '"+newMotorbike.getTrademark()+"'";
				rs = stm.executeQuery(query);
				
				//STEP 4.2: Go across the rs to searching our id wanted
				while(rs.next()) {
					id = rs.getInt(1);
				}
				
				
				//STEP 4.3: Creating the new query and execute it
				for(String currentComment: newMotorbike.getComments()) {
					query = "INSERT INTO descriptions (motorbike,comments) VALUES ("+id+",'"+currentComment+"')";
					isCreated = stm.execute(query);
				}
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			isCreated = false;
		}
		
		return isCreated;
	}
	//READ
	
	public boolean verifyMotorbikeExists(Motorbike motorbike) {
		boolean isExist;
		String query;
		Connection con;
		Statement stm;
		ResultSet rs;
		
		try {
			//STEP 1: Obtaining the connection
			con = DBHelper.getConnection();
			stm = con.createStatement();
			
			//STEP 2: Building the query
			query = "SELECT * FROM motorbikes WHERE modelo = '"+motorbike.getModel()+"' AND marca = '"+motorbike.getTrademark()+"' AND color = '"+motorbike.getColor()
			+"' AND tipo = '"+motorbike.getType()+"' AND precio = "+motorbike.getPrice();
			
			//STEP 3: Doing the query
			rs = stm.executeQuery(query);
			rs.next();
			if(rs.getRow()==0) {
				isExist = false;
			}else {
				isExist = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			isExist = false;
		}
		
		return isExist;
	}
	
	//UPDATE
	
	//DELETE
}
