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

import com.br.classes.Carro;
import com.br.classes.Cliente;
import com.br.classes.Estoque;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaCarro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCarro frame = new TelaCarro();
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
	public TelaCarro() {
		setResizable(false);
		setTitle("Concessionaria Smart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 309);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnSessoDoFuncionario = new JTextPane();
		txtpnSessoDoFuncionario.setText("                     Sess\u00E3o do vendedor");
		txtpnSessoDoFuncionario.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnSessoDoFuncionario.setBackground(new Color(152, 251, 152));
		txtpnSessoDoFuncionario.setBounds(8, 11, 368, 40);
		contentPane.add(txtpnSessoDoFuncionario);
		
		JButton btnComprarCarro = new JButton("Vender carro");
		btnComprarCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CadastrarCarro cadastraCarro = new CadastrarCarro();
				cadastraCarro.setVisible(true);
				setVisible(false);
				
			}
		});
		btnComprarCarro.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnComprarCarro.setBounds(8, 121, 160, 23);
		contentPane.add(btnComprarCarro);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sessao sessao = new Sessao();
				sessao.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(287, 123, 89, 23);
		contentPane.add(btnNewButton);
	}
}