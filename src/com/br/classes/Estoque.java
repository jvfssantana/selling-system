package com.br.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.br.conexao.JdbcConnection;

public class Estoque {
	
	private int idestoque;
	
	public Estoque(int idestoque) {
		
		this.idestoque = idestoque;
	}

	public void decrementaEstoque() {
		
		try {
			JdbcConnection jdbcConnection = new JdbcConnection();
			Connection connection = jdbcConnection.getConnection();
			String sql = "delete from tb_estoque where idestoque = ?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, idestoque);
			
			stmt.execute();
			stmt.close();
			jdbcConnection.closeConnection();
			
			JOptionPane.showMessageDialog(null, "Decrementado com sucesso!");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
 	
}
