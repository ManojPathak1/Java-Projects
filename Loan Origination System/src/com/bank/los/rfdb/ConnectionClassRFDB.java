package com.bank.los.rfdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;
public class ConnectionClassRFDB {
	
	static ConnectionClassRFDB conn=null;
	private ConnectionClassRFDB() {
		
	}
	
	public static ConnectionClassRFDB getObject(){
		if(conn==null){
			conn=new ConnectionClassRFDB();
		}
		return conn;
	}
	
	private ResourceBundle readPropertyFile(){
		ResourceBundle rb=ResourceBundle.getBundle("config");
		return rb;
	}
	
public Connection connectionOpen(){
	Connection con=null;
	try{
		ResourceBundle rb=this.readPropertyFile();
		String driverName=rb.getString("drivername");
		String dburl=rb.getString("dburl");
		String userName=rb.getString("userid");
		String password=rb.getString("password");
	Class.forName(driverName);
	con=DriverManager.getConnection(dburl,userName,password);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return con;
}

}
