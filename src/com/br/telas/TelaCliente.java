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

public class TelaCliente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextPane txtpnSessoDoCliente;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente frame = new TelaCliente();
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
	public TelaCliente() {
		setResizable(false);
		setTitle("Concessionaria Smart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 309);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpnSessoDoCliente = new JTextPane();
		txtpnSessoDoCliente.setText("                       Sess\u00E3o do Cliente");
		txtpnSessoDoCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnSessoDoCliente.setBackground(new Color(152, 251, 152));
		txtpnSessoDoCliente.setBounds(10, 11, 368, 40);
		contentPane.add(txtpnSessoDoCliente);
		
		btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastraCliente cadastraCliente = new CadastraCliente();
				cadastraCliente.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(10, 141, 128, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Atualizar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AtualizarCliente atualizarCliente = new AtualizarCliente();
				atualizarCliente.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(260, 141, 118, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Sair");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sessao sessao = new Sessao();
				sessao.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_2.setBounds(153, 203, 89, 23);
		contentPane.add(btnNewButton_2);
	}

}