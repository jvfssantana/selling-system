package com.br.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.br.conexao.JdbcConnection;

public class Carro {
	
	private String descmarca;
	private String descmodelo;
	private String desccor;
	private String descnovo;
	private String descusado;
	private int proprietario;
	
	public Carro(String descmarca, String descmodelo, String desccor, String descnovo, String descusado, int proprietario) {
		
		this.descmarca = descmarca;
		this.descmodelo = descmodelo;
		this.desccor = desccor;
		this.descnovo = descnovo;
		this.descusado = descusado;
		this.proprietario = proprietario;

	}

	public void persisteCarro() {
		
		try {
			JdbcConnection jdbcConnection = new JdbcConnection();
			Connection connection = jdbcConnection.getConnection();
			String insert = "insert into tb_carro (descmarca, descmodelo, desccor, descnovo, descusado, proprietario) values (?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(insert);
			
			stmt.setString(1, descmarca);
			stmt.setString(2, descmodelo);
			stmt.setString(3, desccor);
			stmt.setString(4, descnovo);
			stmt.setString(5, descusado);
			stmt.setInt(6, proprietario);
			
			stmt.execute();
			stmt.close();
			jdbcConnection.closeConnection();
			
			JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso!");
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
 	
}
