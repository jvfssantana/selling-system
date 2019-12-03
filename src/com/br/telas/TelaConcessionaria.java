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
import com.br.classes.Concessionaria;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaConcessionaria extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConcessionaria frame = new TelaConcessionaria();
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
	public TelaConcessionaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 272);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnSessoDaConcessionaria = new JTextPane();
		txtpnSessoDaConcessionaria.setText("                  Sess\u00E3o da Concessionaria");
		txtpnSessoDaConcessionaria.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnSessoDaConcessionaria.setBackground(new Color(152, 251, 152));
		txtpnSessoDaConcessionaria.setBounds(10, 11, 368, 40);
		contentPane.add(txtpnSessoDaConcessionaria);
		
		JButton btnCadastarConcessionaria = new JButton("Cadastar Concessionaria");
		btnCadastarConcessionaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CadastrarConcessionaria cadastrarConcessionaria = new CadastrarConcessionaria();
				cadastrarConcessionaria.setVisible(true);
				setVisible(false);
				
			}
		});
		btnCadastarConcessionaria.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCadastarConcessionaria.setBounds(10, 112, 257, 23);
		contentPane.add(btnCadastarConcessionaria);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sessao sessao = new Sessao();
				sessao.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(277, 112, 101, 23);
		contentPane.add(btnNewButton);
	}
}
