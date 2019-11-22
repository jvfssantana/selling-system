package com.br.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.br.conexao.JdbcConnection;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String email;
	private String carroID;
	
	public Cliente(String nome, String cpf, String email, String carroID) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.carroID = carroID;
	}
	
	public void persisteCliente() {
			
			try {
				JdbcConnection jdbcConnection = new JdbcConnection();
				Connection connection = jdbcConnection.getConnection();
				String sql = "insert into clientes (cliente_nome, cliente_cpf, cliente_email, cliente_carroID) values (?, ?, ?, ?)";
				PreparedStatement stmt = connection.prepareStatement(sql);
				
				stmt.setString(1, nome);
				stmt.setString(2, cpf);
				stmt.setString(3, email);
				stmt.setString(4, carroID);
		
				stmt.execute();
				stmt.close();
				jdbcConnection.closeConnection();
				
				JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
			}catch (SQLException e) {
				e.printStackTrace();
		}
	}
}