package com.br.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.br.conexao.JdbcConnection;

public class Funcionario {
	
	private String descnome;
	private String descsobrenome;
	private String descfuncao;
	private String desccpf;
	private String descemail;
	
	public Funcionario (String descnome, String descsobrenome, String descfuncao, String desccpf, String descemail) {
		
		this.descnome = descnome;
		this.descsobrenome = descsobrenome;
		this.descfuncao = descfuncao;
		this.desccpf = desccpf;
		this.descemail = descemail;
	
	}
	
	public void persisteFuncionario() {
		
		try {
			JdbcConnection jdbcConnection = new JdbcConnection();
			Connection connection = jdbcConnection.getConnection();
			String sql = "insert into tb_funcionario (descnome, descsobrenome, descfuncao, desccpf, descemail) values (?, ?, ?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, descnome);
			stmt.setString(2, descsobrenome);
			stmt.setString(3, descfuncao);
			stmt.setString(4, desccpf);
			stmt.setString(5, descemail);
	
			stmt.execute();
			stmt.close();
			jdbcConnection.closeConnection();
			
			JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void acessaSistema() {
		
	}
}
