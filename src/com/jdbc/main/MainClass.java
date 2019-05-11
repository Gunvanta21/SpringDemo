package com.jdbc.main;

import java.sql.SQLException;

import com.jdbc.dao.JdbcDaoImpl;
import com.jdbc.model.Circle;

public class MainClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
       Circle circle = null;
		JdbcDaoImpl dao = new JdbcDaoImpl();
		circle = dao.getCircle(1);
		
		System.out.println("Id:"+circle.getId());
		System.out.println("Name:"+circle.getName());

		
	}

}
