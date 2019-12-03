package com.br.telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;

import com.br.classes.Acesso;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Checkbox;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Sistema extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tfEmail;
	private JPasswordField pfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema frame = new Sistema();
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
	public Sistema() {
		setResizable(false);
		getContentPane().setBackground(Color.PINK);
		setTitle("Concessionaria Smart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 300);
		getContentPane().setLayout(null);
		
		JTextPane txtpnAlo = new JTextPane();
		txtpnAlo.setBackground(new Color(152, 251, 152));
		txtpnAlo.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnAlo.setText("Sistema de venda de carros novos e usados!");
		txtpnAlo.setBounds(0, 22, 368, 40);
		getContentPane().add(txtpnAlo);
		
		JButton btnNewButton_4 = new JButton("Acessar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Acesso acesso = new Acesso(tfEmail.getText(), pfSenha.getText());
				acesso.acessaSistema();
				setVisible(false);
			}
			
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.setBackground(new Color(0, 255, 127));
		btnNewButton_4.setBounds(156, 200, 121, 26);
		getContentPane().add(btnNewButton_4);
		
		Panel panel = new Panel();
		panel.setBounds(33, 307, 121, -31);
		getContentPane().add(panel);
		
		JTextPane txtpnFuncionario = new JTextPane();
		txtpnFuncionario.setText("Email:");
		txtpnFuncionario.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnFuncionario.setBackground(new Color(152, 251, 152));
		txtpnFuncionario.setBounds(71, 107, 64, 26);
		getContentPane().add(txtpnFuncionario);
		
		JTextPane txtpnSenha = new JTextPane();
		txtpnSenha.setText("Senha:");
		txtpnSenha.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnSenha.setBackground(new Color(152, 251, 152));
		txtpnSenha.setBounds(71, 150, 64, 26);
		getContentPane().add(txtpnSenha);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(156, 107, 121, 26);
		getContentPane().add(tfEmail);
		tfEmail.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(156, 150, 121, 26);
		getContentPane().add(pfSenha);
	}
}
