 package com.br.telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.br.conexao.JdbcConnection;

public class ExibirConcessionaria extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JPanel contentPane;
	protected JTextField tfNome;
	protected JTextField tfEndereco;
	protected JTextField tfCidade;
	protected JTextField tfEstado;
	protected JTextField tfCep;
	protected JTextField tfTelefone;
	protected JTextField tfEmail;
	protected JTextField tfBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExibirConcessionaria frame = new ExibirConcessionaria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExibirConcessionaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_32 = new JLabel("nome");
		label_32.setBounds(10, 38, 46, 14);
		contentPane.add(label_32);
		
		JLabel lblEndereco = new JLabel("endereco");
		lblEndereco.setBounds(10, 71, 56, 14);
		contentPane.add(lblEndereco);
		
		JLabel lblCidade = new JLabel("cidade");
		lblCidade.setBounds(10, 111, 46, 14);
		contentPane.add(lblCidade);
		
		JLabel lblEstado = new JLabel("estado");
		lblEstado.setBounds(10, 149, 46, 14);
		contentPane.add(lblEstado);
		
		JLabel lblCep = new JLabel("cep");
		lblCep.setBounds(10, 183, 46, 14);
		contentPane.add(lblCep);
		
		JLabel lblTelefone = new JLabel("telefone");
		lblTelefone.setBounds(10, 219, 46, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(253, 38, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblId = new JLabel("id");
		lblId.setBounds(282, 183, 26, 14);
		contentPane.add(lblId);
		
		tfNome = new JTextField();
		tfNome.setBounds(76, 35, 141, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfEndereco = new JTextField();
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(76, 68, 141, 20);
		contentPane.add(tfEndereco);
		
		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		tfCidade.setBounds(76, 108, 141, 20);
		contentPane.add(tfCidade);
		
		tfEstado = new JTextField();
		tfEstado.setColumns(10);
		tfEstado.setBounds(76, 146, 141, 20);
		contentPane.add(tfEstado);
		
		tfCep = new JTextField();
		tfCep.setColumns(10);
		tfCep.setBounds(76, 180, 141, 20);
		contentPane.add(tfCep);
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(76, 216, 141, 20);
		contentPane.add(tfTelefone);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(282, 35, 142, 20);
		contentPane.add(tfEmail);
		
		tfBuscar = new JTextField();
		tfBuscar.setBounds(318, 180, 106, 20);
		contentPane.add(tfBuscar);
		tfBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Concessionaria concessionaria = new Concessionaria(tfBuscar.getText());
//				concessionaria.mostrarConcessionaria();
				try {
					JdbcConnection jdbcConnection = new JdbcConnection();
					Connection connection = jdbcConnection.getConnection();
					String sql = "select * from concessionaria where id_concessionaria like ?";
					PreparedStatement stmt = connection.prepareStatement(sql);
					stmt.setString(1, "%"+tfBuscar.getText());
					ResultSet rs = stmt.executeQuery();
					
					while(rs.next()) {
						tfNome.setText(rs.getString("nome"));
						tfEndereco.setText(rs.getString("endereco"));
						tfCidade.setText(rs.getString("cidade"));
						tfEstado.setText(rs.getString("estado"));
						tfCep.setText(rs.getString("cep"));
						tfTelefone.setText(rs.getString("telefone"));
						tfEmail.setText(rs.getString("email"));
					}
					rs.close();
					jdbcConnection.closeConnection();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnBuscar.setBounds(315, 227, 89, 23);
		contentPane.add(btnBuscar);
	}
}
