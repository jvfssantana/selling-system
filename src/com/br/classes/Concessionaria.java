package com.br.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.br.conexao.JdbcConnection;

public class Concessionaria {
	
	private String nome;
	private String cnpj;
	private String email;
	private String cep;
	private String cidade;
	private String estado;

	public Concessionaria(String nome, String cnpj, String email, String cep, String cidade, String estado) {
		
		this.nome = nome;
		this.cnpj = cnpj;
		this.email = email;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		
		
	}
	
	public void persisteConcessionaria() {
		
		try {
			JdbcConnection jdbcConnection = new JdbcConnection();
			Connection connection = jdbcConnection.getConnection();
			String sql = "insert into concessionaria (concessionaria_nome, concessionaria_cnpj, concessionaria_email, concessionaria_cep, concessionaria_cidade, concessionaria_estado) value ( ?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, nome);
			stmt.setString(2, cnpj);
			stmt.setString(3, email);
			stmt.setString(4, cep);
			stmt.setString(5, cidade);
			stmt.setString(6, estado);
			
			
			stmt.execute();
			stmt.close();
			jdbcConnection.closeConnection();
			
			JOptionPane.showMessageDialog(null, "Concessionaria cadastrada com sucesso!");
	
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
