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

public class CadastrarConcessionaria extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCnpj;
	private JTextField tfEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarConcessionaria frame = new CadastrarConcessionaria();
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
	public CadastrarConcessionaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 278);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setForeground(new Color(0, 255, 127));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(140, 72, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cnpj:");
		lblNewLabel_1.setForeground(new Color(0, 255, 127));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(140, 97, 86, 18);
		contentPane.add(lblNewLabel_1);
		
		tfNome = new JTextField();
		tfNome.setBounds(239, 71, 138, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCnpj = new JTextField();
		tfCnpj.setBounds(239, 98, 138, 20);
		contentPane.add(tfCnpj);
		tfCnpj.setColumns(10);
		
		JLabel lblAno = new JLabel("Email:");
		lblAno.setForeground(new Color(0, 255, 127));
		lblAno.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAno.setBounds(140, 126, 72, 14);
		contentPane.add(lblAno);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(239, 125, 138, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		JTextPane txtpnCadastrarConcessionaria = new JTextPane();
		txtpnCadastrarConcessionaria.setText("                         Cadastrar Concessionaria");
		txtpnCadastrarConcessionaria.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnCadastrarConcessionaria.setBackground(new Color(152, 251, 152));
		txtpnCadastrarConcessionaria.setBounds(10, 11, 434, 40);
		contentPane.add(txtpnCadastrarConcessionaria);
		
		JButton btnNewButton = new JButton("Cadastrar ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Concessionaria concessionaria = new Concessionaria(tfNome.getText(), tfCnpj.getText(), tfEmail.getText());
				concessionaria.persisteConcessionaria();
				Sessao sessao = new Sessao();
				sessao.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 127));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(239, 156, 138, 23);
		contentPane.add(btnNewButton);
	}
}
