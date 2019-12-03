package com.br.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.br.conexao.JdbcConnection;

public class Cliente {
	
	private int idcliente;
	private String descnome;
	private String desccpf;
	private String descemail;
	
	public Cliente(String descnome, String desccpf, String descemail) {
		this.descnome = descnome;
		this.desccpf = desccpf;
		this.descemail = descemail;
	}
	
	public Cliente(int idcliente, String descnome, String desccpf, String descemail) {
		this.idcliente = idcliente;
		this.descnome = descnome;
		this.desccpf = desccpf;
		this.descemail = descemail;
	}
	
	public void persisteCliente() {
			
			try {
				JdbcConnection jdbcConnection = new JdbcConnection();
				Connection connection = jdbcConnection.getConnection();
				String sql = "insert into tb_cliente (descnome, desccpf, descemail) values (?, ?, ?)";
				PreparedStatement stmt = connection.prepareStatement(sql);
				
				stmt.setString(1, descnome);
				stmt.setString(2, desccpf);
				stmt.setString(3, descemail);
				
				stmt.execute();
				stmt.close();
				jdbcConnection.closeConnection();
				
				JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
			}catch (SQLException e) {
				e.printStackTrace();
		}
	}
	
	public void atualizaCliente() {
		
		try {
			JdbcConnection jdbcConnection = new JdbcConnection();
			Connection connection = jdbcConnection.getConnection();
			String sql = "update tb_cliente set descnome = ?, desccpf = ?, descemail = ? where idcliente = ?";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, descnome);
			stmt.setString(2, desccpf);
			stmt.setString(3, descemail);
			stmt.setInt(4, idcliente);
			
			stmt.execute();
			stmt.close();
			jdbcConnection.closeConnection();
			
			JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}