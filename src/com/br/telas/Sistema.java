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
		txtpnSejaBemVindo.setText("* Concessionaria para cadastrar uma concessionaria");
		txtpnSejaBemVindo.setBounds(20, 60, 372, 26);
		getContentPane().add(txtpnSejaBemVindo);
		
		JTextPane txtpnParaCadastrar = new JTextPane();
		txtpnParaCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnParaCadastrar.setText("* Funcionario para cadastrar um funcionario");
		txtpnParaCadastrar.setBounds(20, 97, 372, 26);
		getContentPane().add(txtpnParaCadastrar);
		
		JTextPane txtpnClientePara = new JTextPane();
		txtpnClientePara.setText("* Cliente para cadastrar um cliente");
		txtpnClientePara.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnClientePara.setBounds(20, 134, 372, 26);
		getContentPane().add(txtpnClientePara);
		
		JTextPane txtpnCarroPara = new JTextPane();
		txtpnCarroPara.setText("* Carro para cadastrar uma compra para um cliente");
		txtpnCarroPara.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnCarroPara.setBounds(20, 172, 372, 26);
		getContentPane().add(txtpnCarroPara);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnConcessionaria = new JMenu("Concessionaria");
		menuBar.add(mnConcessionaria);
		
		JMenuItem mntmCadastrarConcessionaria = new JMenuItem("Cadastrar Concessionaria");
		mntmCadastrarConcessionaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CadastrarConcessionaria cadastrarConcessionaria = new CadastrarConcessionaria();
				cadastrarConcessionaria.setVisible(true);
				setVisible(false);
	
			}
		});
		mnConcessionaria.add(mntmCadastrarConcessionaria);
		
		JMenu mnFuncionario = new JMenu("Funcionario");
		menuBar.add(mnFuncionario);
		
		JMenuItem mntmCadastrarFuncionario = new JMenuItem("Cadastrar Funcionario");
		mntmCadastrarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
				cadastrarFuncionario.setVisible(true);
				setVisible(false);
				
			}
		});
		mnFuncionario.add(mntmCadastrarFuncionario);
		
		JMenu mnCliente = new JMenu("Cliente ");
		menuBar.add(mnCliente);
		
		JMenuItem mntmCadastrarCliente = new JMenuItem("Cadastrar Cliente");
		mntmCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastrarCliente cadastrarCliente = new CadastrarCliente();
				cadastrarCliente.setVisible(true);
				setVisible(false);
				
			}
		});
		mnCliente.add(mntmCadastrarCliente);
		
		JMenu mnCarro = new JMenu("Carro");
		menuBar.add(mnCarro);
		
		JMenuItem mntmCadastrarCarro = new JMenuItem("Cadastrar Carro");
		mntmCadastrarCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastrarCarro cadastrarCarro = new CadastrarCarro();
				cadastrarCarro.setVisible(true);
				setVisible(false);
				
			}
		});
		mnCarro.add(mntmCadastrarCarro);
	}
}
