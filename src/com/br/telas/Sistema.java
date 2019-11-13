package com.br.telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class Sistema extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		setBounds(100, 100, 413, 259);
		getContentPane().setLayout(null);
		
		JTextPane txtpnOla = new JTextPane();
		txtpnOla.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnOla.setText("Sistema de vendas de carros");
		txtpnOla.setBounds(84, 15, 238, 34);
		getContentPane().add(txtpnOla);
		
		JTextPane txtpnSejaBemVindo = new JTextPane();
		txtpnSejaBemVindo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnSejaBemVindo.setText("* Para continuar com o sistema cadastre o cliente");
		txtpnSejaBemVindo.setBounds(20, 72, 372, 26);
		getContentPane().add(txtpnSejaBemVindo);
		
		JButton btnNewButton = new JButton("Cadastrar Cliente");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CadastrarCliente cadastrarCliente = new CadastrarCliente();
				cadastrarCliente.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setBounds(128, 169, 161, 23);
		getContentPane().add(btnNewButton);
		
		JTextPane txtpnParaCadastrar = new JTextPane();
		txtpnParaCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnParaCadastrar.setText("* Para cadastrar o cliente clique no bot\u00E3o 'cadastra cliente'");
		txtpnParaCadastrar.setBounds(20, 109, 372, 26);
		getContentPane().add(txtpnParaCadastrar);
	}
}
