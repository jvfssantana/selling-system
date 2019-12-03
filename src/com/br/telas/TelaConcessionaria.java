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
	private JTextField tfNome;
	private JTextField tfCnpj;
	private JTextField tfEmail;
	private JTextField tfFuncionario;

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
		setBounds(100, 100, 404, 212);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastrar = new JMenu("Cadastrar");
		menuBar.add(mnCadastrar);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Concessionaria Concessionaria = new Concessionaria(tfNome.getText(), tfCnpj.getText(), tfEmail.getText());
				Concessionaria.persisteConcessionaria();
				Sessao sessao = new Sessao();
				sessao.setVisible(true);
				setVisible(false);
				
				
			}
		});
		mnCadastrar.add(mntmCadastrar);
		
		JMenu mnAtualizar = new JMenu("Atualizar");
		menuBar.add(mnAtualizar);
		
		JMenuItem mntmAtualizar = new JMenuItem("Atualizar");
		mnAtualizar.add(mntmAtualizar);
		
		JMenu mnExcluir = new JMenu("Excluir");
		menuBar.add(mnExcluir);
		
		JMenuItem mntmExcluir = new JMenuItem("Excluir");
		mnExcluir.add(mntmExcluir);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setForeground(new Color(0, 255, 127));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 25, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cnpj:");
		lblNewLabel_1.setForeground(new Color(0, 255, 127));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 50, 86, 18);
		contentPane.add(lblNewLabel_1);
		
		tfNome = new JTextField();
		tfNome.setBounds(87, 24, 86, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCnpj = new JTextField();
		tfCnpj.setBounds(87, 51, 86, 20);
		contentPane.add(tfCnpj);
		tfCnpj.setColumns(10);
		
		JLabel lblAno = new JLabel("Email:");
		lblAno.setForeground(new Color(0, 255, 127));
		lblAno.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAno.setBounds(10, 79, 72, 14);
		contentPane.add(lblAno);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(87, 78, 86, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setForeground(new Color(0, 255, 127));
		lblId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblId.setBounds(10, 104, 35, 14);
		contentPane.add(lblId);
		
		tfFuncionario = new JTextField();
		tfFuncionario.setColumns(10);
		tfFuncionario.setBounds(87, 103, 86, 20);
		contentPane.add(tfFuncionario);
	}
}
