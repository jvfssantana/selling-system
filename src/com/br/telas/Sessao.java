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

public class Sessao extends JFrame {

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
					Sessao frame = new Sessao();
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
	public Sessao() {
		setResizable(false);
		getContentPane().setBackground(Color.PINK);
		setTitle("Concessionaria Smart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 300);
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(33, 307, 121, -31);
		getContentPane().add(panel);
		
		JTextPane txtpnSejaBemVindo = new JTextPane();
		txtpnSejaBemVindo.setText("                       Seja bem vindo!");
		txtpnSejaBemVindo.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnSejaBemVindo.setBackground(new Color(152, 251, 152));
		txtpnSejaBemVindo.setBounds(0, 25, 365, 40);
		getContentPane().add(txtpnSejaBemVindo);
		
		JButton btnNewButton = new JButton("1 - Concessionaria");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TelaConcessionaria concessionaria = new TelaConcessionaria();
				concessionaria.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setBounds(33, 98, 141, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnFuncionario = new JButton("2 - Funcionario");
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaFuncionario funcionario = new TelaFuncionario();
				funcionario.setVisible(true);
				setVisible(false);
				
			}
		});
		btnFuncionario.setBounds(33, 146, 141, 23);
		getContentPane().add(btnFuncionario);
		
		JButton btnEstoque = new JButton("3 - Estoque ");
		btnEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaEstoque estoque = new TelaEstoque();
				estoque.setVisible(true);
				setVisible(false);
				
			}
		});
		btnEstoque.setBounds(33, 196, 141, 23);
		getContentPane().add(btnEstoque);
		
		JButton btnCliente = new JButton("4 - Cliente");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaCliente cliente = new TelaCliente();
				cliente.setVisible(true);
				setVisible(false);
				
			}
		});
		btnCliente.setBounds(207, 98, 100, 23);
		getContentPane().add(btnCliente);
		
		JButton btnCarro = new JButton("5 - Carro");
		btnCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaCarro carro = new TelaCarro();
				carro.setVisible(true);
				setVisible(false);
				
			}
		});
		btnCarro.setBounds(207, 146, 100, 23);
		getContentPane().add(btnCarro);
		
		JButton btnAcesso = new JButton("6 - Acesso");
		btnAcesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaAcesso acesso = new TelaAcesso();
				acesso.setVisible(true);
				setVisible(false);
				
			}
		});
		btnAcesso.setBounds(207, 196, 100, 23);
		getContentPane().add(btnAcesso);
	}
}
