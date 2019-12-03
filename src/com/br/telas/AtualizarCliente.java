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

public class AtualizarCliente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfBusca;
	private JTextField tfNome;
	private JTextField tfCpf;
	private JTextField tfEmail;
	private JTable tbDados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarCliente frame = new AtualizarCliente();
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
	public AtualizarCliente() {
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
		txtpnCadastrarCliente.setText("                                                            Atualizar cliente");
		txtpnCadastrarCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnCadastrarCliente.setBackground(new Color(152, 251, 152));
		txtpnCadastrarCliente.setBounds(10, 11, 686, 40);
		contentPane.add(txtpnCadastrarCliente);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Abrir dados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(0, 255, 127));
		panel.setBounds(10, 267, 686, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tfBusca = new JTextField();
		tfBusca.setBounds(35, 19, 86, 20);
		panel.add(tfBusca);
		tfBusca.setColumns(10);
		
		JButton btnNewButton = new JButton("Abrir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tfBusca.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Informe um ID");
				} else  {

				try {
					JdbcConnection jdbcConnection = new JdbcConnection();
					Connection connection = jdbcConnection.getConnection();
					String sql = "select * from tb_cliente where idcliente like ?";
					PreparedStatement stmt = connection.prepareStatement(sql);
					
					stmt.setString(1, "%"+tfBusca.getText());
					
					ResultSet rs = stmt.executeQuery();
					
					while(rs.next()) {
						
						tfNome.setText(rs.getString("descnome"));
						tfCpf.setText(rs.getString("desccpf"));
						tfEmail.setText(rs.getString("descemail"));
						
						
					}
					
					stmt.close();
					jdbcConnection.closeConnection();
			
				}catch (SQLException ee) {
					ee.printStackTrace();
				}
			}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(131, 16, 130, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(10, 22, 15, 14);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Listar dados");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					JdbcConnection jdbcConnection = new JdbcConnection();
					Connection connection = jdbcConnection.getConnection();
					String sql = "select * from tb_cliente";
					PreparedStatement stmt = connection.prepareStatement(sql);
					
					ResultSet rs = stmt.executeQuery();
					
					DefaultTableModel modelo = (DefaultTableModel) tbDados.getModel();
					modelo.setRowCount(0);
					
					while(rs.next()) {
						
						modelo.addRow(new Object[]{rs.getString("idcliente"), rs.getString("descnome"), rs.getString("desccpf"), rs.getString("descemail")});
						
						
					}
					
					stmt.close();
					jdbcConnection.closeConnection();
			
				}catch (SQLException ee) {
					ee.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(425, 16, 152, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Atualizar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tfBusca.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Informe um ID:");
				} else {
					Cliente cliente = new Cliente(Integer.parseInt(tfBusca.getText()), tfNome.getText(), tfCpf.getText(), tfEmail.getText());
					cliente.atualizaCliente();
					
				}
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(271, 16, 144, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Voltar ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Sessao sessao = new Sessao();
				sessao.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(587, 16, 89, 23);
		panel.add(btnNewButton_3);
		
		JLabel label = new JLabel("Nome:");
		label.setForeground(new Color(0, 255, 127));
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(233, 84, 72, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Cpf:");
		label_1.setForeground(new Color(0, 255, 127));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(233, 109, 42, 18);
		contentPane.add(label_1);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(331, 80, 128, 20);
		contentPane.add(tfNome);
		
		tfCpf = new JTextField();
		tfCpf.setColumns(10);
		tfCpf.setBounds(331, 107, 128, 20);
		contentPane.add(tfCpf);
		
		JLabel label_2 = new JLabel("Email:");
		label_2.setForeground(new Color(0, 255, 127));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(233, 144, 51, 14);
		contentPane.add(label_2);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(331, 138, 128, 20);
		contentPane.add(tfEmail);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 173, 686, 90);
		contentPane.add(scrollPane);
		
		tbDados = new JTable();
		tbDados.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"idcliente", "descnome", "desccpf", "descemail"
			}
		));
		scrollPane.setViewportView(tbDados);
	}
}