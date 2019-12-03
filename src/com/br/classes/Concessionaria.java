package com.br.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.br.conexao.JdbcConnection;

public class Concessionaria {
	
	private String descnome;
	private String desccnpj;
	private String descemail;
	private int funcionario;

	public Concessionaria(String descnome, String desccnpj, String descemail) {
		
		this.descnome = descnome;
		this.desccnpj = desccnpj;
		this.descemail = descemail;
		
	}
	
	public void persisteConcessionaria() {
		
		try {
			JdbcConnection jdbcConnection = new JdbcConnection();
			Connection connection = jdbcConnection.getConnection();
			String sql = "insert into tb_concessionaria (descnome , desccnpj, descemail) value (?, ?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, descnome);
			stmt.setString(2, desccnpj);
			stmt.setString(3, descemail);
			
			stmt.execute();
			stmt.close();
			jdbcConnection.closeConnection();
			
			JOptionPane.showMessageDialog(null, "Concessionaria cadastrada com sucesso!");
	
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
