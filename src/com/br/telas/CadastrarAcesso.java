package com.br.telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.br.classes.Acesso;
import com.br.classes.Cliente;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;

public class CadastrarAcesso extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel label;
	private JTextField tfNome;
	private JLabel label_2;
	private JTextField tfEmail;
	private JPasswordField passwordField;
	private JPasswordField pfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarAcesso frame = new CadastrarAcesso();
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
	public CadastrarAcesso() {
		setResizable(false);
		setTitle("Concessionaria Smart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 309);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("Nome:");
		label.setForeground(new Color(0, 255, 127));
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(89, 76, 60, 14);
		contentPane.add(label);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(160, 75, 128, 20);
		contentPane.add(tfNome);
		
		label_2 = new JLabel("Email:");
		label_2.setForeground(new Color(0, 255, 127));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(89, 101, 60, 14);
		contentPane.add(label_2);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(160, 101, 128, 20);
		contentPane.add(tfEmail);
		
		JTextPane txtpnCadastrarCliente = new JTextPane();
		txtpnCadastrarCliente.setText("                       Cadastrar acesso");
		txtpnCadastrarCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnCadastrarCliente.setBackground(new Color(152, 251, 152));
		txtpnCadastrarCliente.setBounds(10, 11, 368, 40);
		contentPane.add(txtpnCadastrarCliente);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Acesso acesso = new Acesso(tfNome.getText(), tfEmail.getText(), pfSenha.getText());
				acesso.persisteAcesso();
				Sessao sessao = new Sessao();
				sessao.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 127));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(160, 159, 128, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(new Color(0, 255, 127));
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSenha.setBounds(89, 131, 60, 14);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(197, 223, -22, 20);
		contentPane.add(passwordField);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(160, 132, 128, 20);
		contentPane.add(pfSenha);
	}
}