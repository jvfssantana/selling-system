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
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class CadastraCliente extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastraCliente frame = new CadastraCliente();
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
	public CadastraCliente() {
		setResizable(false);
		setTitle("Concessionaria Smart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 309);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("Nome:");
		label.setForeground(new Color(0, 255, 127));
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(89, 76, 72, 14);
		contentPane.add(label);
		
		lblCpf = new JLabel("Cpf:");
		lblCpf.setForeground(new Color(0, 255, 127));
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCpf.setBounds(89, 101, 67, 18);
		contentPane.add(lblCpf);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(160, 75, 128, 20);
		contentPane.add(tfNome);
		
		tfCpf = new JTextField();
		tfCpf.setColumns(10);
		tfCpf.setBounds(160, 102, 128, 20);
		contentPane.add(tfCpf);
		
		label_2 = new JLabel("Email:");
		label_2.setForeground(new Color(0, 255, 127));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(89, 134, 72, 14);
		contentPane.add(label_2);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(160, 133, 128, 20);
		contentPane.add(tfEmail);
		
		JTextPane txtpnCadastrarCliente = new JTextPane();
		txtpnCadastrarCliente.setText("                       Cadastrar cliente");
		txtpnCadastrarCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnCadastrarCliente.setBackground(new Color(152, 251, 152));
		txtpnCadastrarCliente.setBounds(10, 11, 368, 40);
		contentPane.add(txtpnCadastrarCliente);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Cliente cliente = new Cliente(tfNome.getText(), tfCpf.getText(), tfEmail.getText());
				cliente.persisteCliente();
				Sessao sessao = new Sessao();
				sessao.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 127));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(160, 159, 128, 23);
		contentPane.add(btnNewButton);
	}
}