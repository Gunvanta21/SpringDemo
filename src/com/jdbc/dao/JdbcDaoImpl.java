package com.jdbc.dao;

import java.sql.*;

import com.jdbc.model.Circle;

public class JdbcDaoImpl {
	
	Connection conn =null;
	Circle circle = null;
	public Circle getCircle(int circleId)  {
	String connString= "jdbc:derby://localhost:1527/db";
	String driver ="org.apache.derby.jdbc.ClientDriver";
	try {
	Class.forName(driver).newInstance();
	conn = DriverManager.getConnection(connString);
	PreparedStatement pstmt = conn.prepareStatement("Select * from Circle where id=?");
	pstmt.setInt(1,circleId);
	
	ResultSet rs = pstmt.executeQuery();
	
	if(rs.next()) {
		
		circle = new Circle(circleId,rs.getString("name"));
		
	}
	conn.close();
	return circle;	
	}catch(Exception e) {
		throw new RuntimeException(e);
	}finally{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
	
}


