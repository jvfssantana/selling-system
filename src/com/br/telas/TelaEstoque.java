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
import com.br.classes.Estoque;
import com.br.classes.Funcionario;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaEstoque extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEstoque frame = new TelaEstoque();
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
	public TelaEstoque() {
		setResizable(false);
		setTitle("Concessionaria Smart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 265);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnSessoDoEstoque = new JTextPane();
		txtpnSessoDoEstoque.setText("                       Sess\u00E3o do Estoque");
		txtpnSessoDoEstoque.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnSessoDoEstoque.setBackground(new Color(152, 251, 152));
		txtpnSessoDoEstoque.setBounds(10, 11, 368, 40);
		contentPane.add(txtpnSessoDoEstoque);
		
		JButton btnNewButton = new JButton("Cadastrar carro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastrarEstoque cadastrarEstoque = new CadastrarEstoque();
				cadastrarEstoque.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(10, 120, 183, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Listar estoque");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ListarEstoque listarEstoque = new ListarEstoque();
				listarEstoque.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(224, 120, 154, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sair");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Sessao sessao = new Sessao();
				sessao.setVisible(true);
				setVisible(false);
			
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(166, 176, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}