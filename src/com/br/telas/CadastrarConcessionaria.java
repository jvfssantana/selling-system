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

public class CadastrarConcessionaria extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCnpj;
	private JTextField tfCidade;
	private JTextField tfCep;
	private JTextField tfEstado;
	private JTextPane txtpnInformeOs;
	private JTextPane txtpnParaEfetuar;
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
		setBounds(100, 100, 421, 314);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 103, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cnpj:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(213, 103, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cidade:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 153, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cep:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(213, 129, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Estado:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(213, 154, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		tfNome = new JTextField();
		tfNome.setBounds(87, 101, 86, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCnpj = new JTextField();
		tfCnpj.setBounds(305, 101, 86, 20);
		contentPane.add(tfCnpj);
		tfCnpj.setColumns(10);
		
		tfCidade = new JTextField();
		tfCidade.setBounds(87, 150, 86, 20);
		contentPane.add(tfCidade);
		tfCidade.setColumns(10);
		
		tfCep = new JTextField();
		tfCep.setBounds(305, 126, 86, 20);
		contentPane.add(tfCep);
		tfCep.setColumns(10);
		
		tfEstado = new JTextField();
		tfEstado.setBounds(305, 151, 86, 20);
		contentPane.add(tfEstado);
		tfEstado.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar Concessionaria");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Concessionaria concessionaria = new Concessionaria(tfNome.getText(), tfCnpj.getText(), tfEmail.getText(), tfCep.getText(), tfCidade.getText(), tfEstado.getText());
				concessionaria.persisteConcessionaria();
				Sistema sistema = new Sistema();
				sistema.setVisible(true);
				setVisible(false);

			}
		});
		btnNewButton.setBounds(106, 217, 199, 23);
		contentPane.add(btnNewButton);
		
		txtpnInformeOs = new JTextPane();
		txtpnInformeOs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnInformeOs.setText("* Informe os dados da concessionaria para efetuar o cadastro");
		txtpnInformeOs.setBounds(10, 11, 385, 20);
		contentPane.add(txtpnInformeOs);
		
		txtpnParaEfetuar = new JTextPane();
		txtpnParaEfetuar.setText("* Para efetuar o cadastro clique em 'Cadastrar Concessionaria'");
		txtpnParaEfetuar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnParaEfetuar.setBounds(10, 41, 385, 20);
		contentPane.add(txtpnParaEfetuar);
		
		JLabel lblAno = new JLabel("Email:");
		lblAno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAno.setBounds(10, 128, 72, 14);
		contentPane.add(lblAno);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(87, 127, 86, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
	}
}
