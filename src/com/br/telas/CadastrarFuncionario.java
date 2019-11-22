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
import com.br.classes.Funcionario;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;

public class CadastrarFuncionario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfCpf;
	private JTextPane txtpnInformeOs;
	private JTextPane txtpnCliqueEm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarFuncionario frame = new CadastrarFuncionario();
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
	public CadastrarFuncionario() {
		setResizable(false);
		setTitle("Concessionaria Smart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 314);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(10, 145, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCpf.setBounds(10, 180, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(10, 221, 46, 14);
		contentPane.add(lblEmail);
		
		tfNome = new JTextField();
		tfNome.setBounds(66, 143, 86, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCpf = new JTextField();
		tfCpf.setColumns(10);
		tfCpf.setBounds(66, 215, 86, 20);
		contentPane.add(tfCpf);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(66, 178, 86, 20);
		contentPane.add(tfEmail);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(Color.RED);
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				Funcionario funcionario = new Funcionario(tfNome.getText(), tfCpf.getText(), tfEmail.getText());
				funcionario.persisteFuncionario();
				setVisible(false);
				
			}
		});
		btnCadastrar.setBounds(200, 176, 111, 23);
		contentPane.add(btnCadastrar);
		
		txtpnInformeOs = new JTextPane();
		txtpnInformeOs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnInformeOs.setText("* Informe os dados do funcionario abaixo");
		txtpnInformeOs.setBounds(10, 56, 364, 20);
		contentPane.add(txtpnInformeOs);
		
		txtpnCliqueEm = new JTextPane();
		txtpnCliqueEm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnCliqueEm.setText("* Clique em 'Cadastrar' para efetuar o cadastro");
		txtpnCliqueEm.setBounds(10, 87, 364, 20);
		contentPane.add(txtpnCliqueEm);
		
		JLabel lblCadastrarFuncionario = new JLabel("Cadastrar Funcionario");
		lblCadastrarFuncionario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCadastrarFuncionario.setBounds(117, 11, 195, 14);
		contentPane.add(lblCadastrarFuncionario);
	}
}