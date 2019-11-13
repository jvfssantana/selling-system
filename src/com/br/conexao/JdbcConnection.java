package com.br.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcConnection {
	
	private Connection con = null;
	
	private String hostName = null;
	private String userName = null;
	private String password = null;
	private String url = null;
	private String jdbcDriver = null;
	private String dataBaseName = null;
	private String dataBasePrefix = null;
	private String dabaBasePort = null; 

	public JdbcConnection() {
		super();
		
		hostName = "localhost";
		userName = "root";
		password = "Acessobancoima22@";
		jdbcDriver = "org.gjt.mm.mysql.Driver";
		dataBaseName = "db_projeto";
		dataBasePrefix = "jdbc:mysql://";
		dabaBasePort = "3306";
		
		//autoReconnect=true&useSSL=false
		
		url = dataBasePrefix + hostName+":"+dabaBasePort+"/"+dataBaseName+"?"+"serverTimezone=UTC&useSSL=false";
	}
	
	public Connection getConnection() {
		
		try {
			if(con == null) {
				Class.forName(jdbcDriver);
				con = DriverManager.getConnection(url, userName, password);
			}else if(con.isClosed()) {
				con = null;
				return getConnection();
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void closeConnection() {
		if(con != null) {
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public PreparedStatement prepareStatement(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	
}