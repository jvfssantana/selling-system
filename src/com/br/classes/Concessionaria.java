package com.br.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.br.conexao.JdbcConnection;
import com.br.telas.ExibirConcessionaria;

public class Concessionaria extends ExibirConcessionaria {
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String endereco;
	private String cidade;
	private String estado;
	private String cep;
	private String telefone;
	private String email;

	public Concessionaria(String nome, String endereco, String cidade, String estado, String cep, String telefone, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
		this.email = email;
	}
	
	public void persisteConcessionaria() {
		
		try {
			JdbcConnection jdbcConnection = new JdbcConnection();
			Connection connection = jdbcConnection.getConnection();
			String sql = "insert into concessionaria (nome, endereco, cidade, estado, cep, telefone, email) value ( ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, nome);
			stmt.setString(2, endereco);
			stmt.setString(3, cidade);
			stmt.setString(4, estado);
			stmt.setString(5, cep);
			stmt.setString(6, telefone);
			stmt.setString(7, email);
			
			stmt.execute();
			stmt.close();
			jdbcConnection.closeConnection();
			
			JOptionPane.showMessageDialog(null, "Concessionaria cadastrada com sucesso!");
	
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
//	public void mostrarConcessionaria() {
//		try {
//			JdbcConnection jdbcConnection = new JdbcConnection();
//			Connection connection = jdbcConnection.getConnection();
//			String sql = "select * from concessionaria where id_concessionaria like ?";
//			PreparedStatement stmt = connection.prepareStatement(sql);
//			stmt.setString(1, "%"+tfBuscar.getText());
//			ResultSet rs = stmt.executeQuery();
//			
//			while(rs.next()) {
//				tfNome.setText(rs.getString("nome"));
//				tfEndereco.setText(rs.getString("endereco"));
//				tfCidade.setText(rs.getString("cidade"));
//				tfEstado.setText(rs.getString("estado"));
//				tfCep.setText(rs.getString("cep"));
//				tfTelefone.setText(rs.getString("telefone"));
//				tfEmail.setText(rs.getString("email"));
//			}
//			rs.close();
//			jdbcConnection.closeConnection();
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}
//
//	}
}
