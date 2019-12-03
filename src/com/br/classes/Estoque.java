package com.br.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.br.conexao.JdbcConnection;

public class Estoque {
	
	private int idestoque;
	private String descmarca;
	private String descmodelo;
	private String desccor;
	private String descnovo;
	private String descusado;
	
	public Estoque(int idestoque) {
		this.idestoque = idestoque;
	}
	
	public Estoque(String descmarca, String descmodelo, String desccor, String descnovo, String descusado) {
		this.descmarca = descmarca;
		this.descmodelo = descmodelo;
		this.desccor = desccor;
		this.descnovo = descnovo;
		this.descusado = descusado;
	}

	public void decrementaEstoque() {
		
		try {
			JdbcConnection jdbcConnection = new JdbcConnection();
			Connection connection = jdbcConnection.getConnection();
			String delete = "delete from tb_estoque where idestoque = ?";
			PreparedStatement stmt = connection.prepareStatement(delete);
			
			stmt.setInt(1, idestoque);
			
			stmt.execute();
			stmt.close();
			jdbcConnection.closeConnection();
			
			JOptionPane.showMessageDialog(null, "Carro acaba de sair do estoque");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void persisteEstoque() {
		
		try {
			JdbcConnection jdbcConnection = new JdbcConnection();
			Connection connection = jdbcConnection.getConnection();
			String persiste = "insert into tb_estoque (descmarca, descmodelo, desccor, descnovo, descusado) values (?, ?, ?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(persiste);
			
			stmt.setString(1, descmarca);
			stmt.setString(2, descmodelo);
			stmt.setString(3, desccor);
			stmt.setString(4, descusado);
			stmt.setString(5, descnovo);
			
			stmt.execute();
			stmt.close();
			jdbcConnection.closeConnection();
			
			JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 	
}
