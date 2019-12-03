package com.br.telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.br.classes.Cliente;
import com.br.conexao.JdbcConnection;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;

public class ListarEstoque extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tbDados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarEstoque frame = new ListarEstoque();
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
	public ListarEstoque() {
		setResizable(false);
		setTitle("Concessionaria Smart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 355);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnCadastrarCliente = new JTextPane();
		txtpnCadastrarCliente.setText("                                                            Lista estoque");
		txtpnCadastrarCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnCadastrarCliente.setBackground(new Color(152, 251, 152));
		txtpnCadastrarCliente.setBounds(10, 11, 686, 40);
		contentPane.add(txtpnCadastrarCliente);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Listar dados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(0, 255, 127));
		panel.setBounds(10, 267, 686, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Listar dados");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					JdbcConnection jdbcConnection = new JdbcConnection();
					Connection connection = jdbcConnection.getConnection();
					String sql = "select * from tb_estoque";
					PreparedStatement stmt = connection.prepareStatement(sql);
					
					ResultSet rs = stmt.executeQuery();
					
					DefaultTableModel modelo = (DefaultTableModel) tbDados.getModel();
					modelo.setRowCount(0);
					
					while(rs.next()) {
						
						modelo.addRow(new Object[]{rs.getString("idestoque"), rs.getString("descmarca"), rs.getString("descmodelo"), rs.getString("desccor"), rs.getString("descnovo"), rs.getString("descusado")});
						
						
					}
					
					stmt.close();
					jdbcConnection.closeConnection();
			
				}catch (SQLException ee) {
					ee.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(21, 16, 152, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Voltar ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Sessao sessao = new Sessao();
				sessao.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(223, 16, 89, 23);
		panel.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 81, 686, 90);
		contentPane.add(scrollPane);
		
		tbDados = new JTable();
		tbDados.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"idestoque", "descmarca", "descmodelo", "desccor", "descnovo", "descusado"
			}
		));
		scrollPane.setViewportView(tbDados);
	}
}