package com.br.classes;

import com.br.conexao.JdbcConnection;
import com.br.telas.Sessao;
import com.br.telas.Sistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Acesso {
	
	private String descemail;
	private String descsenha;
	
	public Acesso (String descemail, String descsenha) {
		
		this.descemail = descemail;
		this.descsenha = descsenha;
	}
	
	
	public void acessaSistema() {
		
		try {
			JdbcConnection jdbcConnection = new JdbcConnection();
			Connection connection = jdbcConnection.getConnection();
			String sql = "select * from tb_acesso_sistema where descemail = ? and descsenha = ?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, descemail);
			stmt.setString(2, descsenha);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				
				Sessao sessao = new Sessao();
				sessao.setVisible(true);
	
				
			} else {
				JOptionPane.showMessageDialog(null, "Usuário ou senha estão incorretos!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
