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

import com.br.classes.Cliente;
import com.br.classes.Concessionaria;
import com.br.classes.Funcionario;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaAcesso extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextPane txtpnSessoFuncioanrio;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAcesso frame = new TelaAcesso();
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
	public TelaAcesso() {
		setResizable(false);
		setTitle("Concessionaria Smart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 419, 205);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpnSessoFuncioanrio = new JTextPane();
		txtpnSessoFuncioanrio.setText("                         Sess\u00E3o Acesso");
		txtpnSessoFuncioanrio.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnSessoFuncioanrio.setBackground(new Color(152, 251, 152));
		txtpnSessoFuncioanrio.setBounds(21, 11, 368, 40);
		contentPane.add(txtpnSessoFuncioanrio);
		
		btnNewButton = new JButton("Cadastrar Acesso");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastrarAcesso cadastrarAcesso = new CadastrarAcesso();
				cadastrarAcesso.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(21, 106, 220, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sessao sessao = new Sessao();
				sessao.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(300, 106, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}