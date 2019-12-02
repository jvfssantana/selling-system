package com.br.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.br.conexao.JdbcConnection;

public class Carro {
	
	private String marca;
	private String modelo;
	private String cor;
	private String novo;
	private String usado;
	private String clienteID;
	
	public Carro(String marca, String modelo, String cor, String novo, String usado, String clienteID) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.novo = novo;
		this.usado = usado;
		this.clienteID = clienteID;

	}

	public void persisteCarro() {
		
		try {
			JdbcConnection jdbcConnection = new JdbcConnection();
			Connection connection = jdbcConnection.getConnection();
			String sql = "insert into carro (marca, modelo, cor, novo, usado, clienteID) values (?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, marca);
			stmt.setString(2, modelo);
			stmt.setString(3, cor);
			stmt.setString(4, novo);
			stmt.setString(5, usado);
			stmt.setString(6, clienteID);
			
			stmt.execute();
			stmt.close();
			jdbcConnection.closeConnection();
			
			JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso!");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
 	
}
