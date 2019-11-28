package com.br.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.br.conexao.JdbcConnection;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private String email;
	
	public Funcionario (String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	public void persisteFuncionario() {
		
		try {
			JdbcConnection jdbcConnection = new JdbcConnection();
			Connection connection = jdbcConnection.getConnection();
			String sql = "insert into funcionarios (funcionario_nome, funcionario_cpf, funcionario_email) values (?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, nome);
			stmt.setString(2, cpf);
			stmt.setString(3, email);
	
			stmt.execute();
			stmt.close();
			jdbcConnection.closeConnection();
			
			JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
