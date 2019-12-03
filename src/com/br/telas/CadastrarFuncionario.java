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

public class CadastrarFuncionario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel label;
	private JLabel lblCpf;
	private JTextField tfNome;
	private JTextField tfCpf;
	private JLabel label_2;
	private JTextField tfEmail;
	private JLabel lblSobrenome;
	private JTextField tfSobrenome;
	private JLabel lblFuno;
	private JTextField tfFuncao;
	private JTextPane txtpnCadastrarFuncionario;
	private JButton btnNewButton;

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
		setBounds(100, 100, 464, 205);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("Nome:");
		label.setForeground(new Color(0, 255, 127));
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(10, 62, 72, 14);
		contentPane.add(label);
		
		lblCpf = new JLabel("Cpf:");
		lblCpf.setForeground(new Color(0, 255, 127));
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCpf.setBounds(191, 89, 58, 18);
		contentPane.add(lblCpf);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(78, 61, 86, 20);
		contentPane.add(tfNome);
		
		tfCpf = new JTextField();
		tfCpf.setColumns(10);
		tfCpf.setBounds(295, 86, 138, 20);
		contentPane.add(tfCpf);
		
		label_2 = new JLabel("Email:");
		label_2.setForeground(new Color(0, 255, 127));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(10, 112, 72, 14);
		contentPane.add(label_2);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(78, 114, 86, 20);
		contentPane.add(tfEmail);
		
		lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setForeground(new Color(0, 255, 127));
		lblSobrenome.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSobrenome.setBounds(191, 60, 103, 18);
		contentPane.add(lblSobrenome);
		
		tfSobrenome = new JTextField();
		tfSobrenome.setColumns(10);
		tfSobrenome.setBounds(295, 61, 138, 20);
		contentPane.add(tfSobrenome);
		
		lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setForeground(new Color(0, 255, 127));
		lblFuno.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFuno.setBounds(10, 87, 72, 14);
		contentPane.add(lblFuno);
		
		tfFuncao = new JTextField();
		tfFuncao.setColumns(10);
		tfFuncao.setBounds(78, 87, 86, 20);
		contentPane.add(tfFuncao);
		
		txtpnCadastrarFuncionario = new JTextPane();
		txtpnCadastrarFuncionario.setText("                         Cadastrar funcionario");
		txtpnCadastrarFuncionario.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnCadastrarFuncionario.setBackground(new Color(152, 251, 152));
		txtpnCadastrarFuncionario.setBounds(10, 11, 434, 40);
		contentPane.add(txtpnCadastrarFuncionario);
		
		btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Funcionario funcionario = new Funcionario(tfNome.getText(), tfSobrenome.getText(), tfFuncao.getText(), tfCpf.getText(), tfEmail.getText());
				funcionario.persisteFuncionario();
				Sessao sessao = new Sessao();
				sessao.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 127));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(295, 128, 138, 23);
		contentPane.add(btnNewButton);
	}
}

