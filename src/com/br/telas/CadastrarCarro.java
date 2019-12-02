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
import com.br.classes.Estoque;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;

public class CadastrarCarro extends JFrame {

	private JPanel contentPane;
	private JTextField tfMarca;
	private JTextField tfModelo;
	private JTextField tfCor;
	private JTextField tfNovo;
	private JTextField tfUsado;
	private JTextPane txtpnInformeOs;
	private JTextPane txtpnParaEfetuar;
	private JTextField tfAno;
	private JTextField tfProprietario;
	private JLabel lblEstoqueid;
	private JTextField tfEstoqueid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarCarro frame = new CadastrarCarro();
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
	public CadastrarCarro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 314);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Marca:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 107, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Modelo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 132, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cor:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 177, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Carro novo:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(213, 107, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Carro Usado: ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(213, 132, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		tfMarca = new JTextField();
		tfMarca.setBounds(87, 105, 86, 20);
		contentPane.add(tfMarca);
		tfMarca.setColumns(10);
		
		tfModelo = new JTextField();
		tfModelo.setBounds(87, 130, 86, 20);
		contentPane.add(tfModelo);
		tfModelo.setColumns(10);
		
		tfCor = new JTextField();
		tfCor.setBounds(87, 175, 86, 20);
		contentPane.add(tfCor);
		tfCor.setColumns(10);
		
		tfNovo = new JTextField();
		tfNovo.setBounds(305, 105, 86, 20);
		contentPane.add(tfNovo);
		tfNovo.setColumns(10);
		
		tfUsado = new JTextField();
		tfUsado.setBounds(305, 130, 86, 20);
		contentPane.add(tfUsado);
		tfUsado.setColumns(10);
		
		JButton btnNewButton = new JButton("Efetuar Compra");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Carro carro = new Carro(tfMarca.getText(), tfModelo.getText(), tfCor.getText(), tfNovo.getText(), tfUsado.getText(), Integer.parseInt(tfProprietario.getText()));
				carro.persisteCarro();
				Estoque estoque = new Estoque(Integer.parseInt(tfEstoqueid.getText()));
				estoque.decrementaEstoque();
				Sistema sistema = new Sistema();
				sistema.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setBounds(135, 225, 141, 23);
		contentPane.add(btnNewButton);
		
		txtpnInformeOs = new JTextPane();
		txtpnInformeOs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnInformeOs.setText("* Informe os dados do carro ");
		txtpnInformeOs.setBounds(10, 11, 385, 20);
		contentPane.add(txtpnInformeOs);
		
		txtpnParaEfetuar = new JTextPane();
		txtpnParaEfetuar.setText("* Para efetuar a compra clique em 'Efetuar compra'");
		txtpnParaEfetuar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnParaEfetuar.setBounds(10, 41, 385, 20);
		contentPane.add(txtpnParaEfetuar);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAno.setBounds(10, 154, 72, 14);
		contentPane.add(lblAno);
		
		tfAno = new JTextField();
		tfAno.setBounds(87, 152, 86, 20);
		contentPane.add(tfAno);
		tfAno.setColumns(10);
		
		JLabel lblClienteid = new JLabel("ProprietarioID:");
		lblClienteid.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClienteid.setBounds(213, 154, 86, 14);
		contentPane.add(lblClienteid);
		
		tfProprietario = new JTextField();
		tfProprietario.setColumns(10);
		tfProprietario.setBounds(305, 152, 86, 20);
		contentPane.add(tfProprietario);
		
		lblEstoqueid = new JLabel("estoqueID:");
		lblEstoqueid.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEstoqueid.setBounds(213, 178, 86, 14);
		contentPane.add(lblEstoqueid);
		
		tfEstoqueid = new JTextField();
		tfEstoqueid.setColumns(10);
		tfEstoqueid.setBounds(305, 175, 86, 20);
		contentPane.add(tfEstoqueid);
		
	}
}
