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
import com.br.classes.Cliente;
import com.br.classes.Estoque;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class CadastrarCarro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblMarca;
	private JLabel lblCpf;
	private JTextField tfMarca;
	private JTextField tfModelo;
	private JLabel lblCor;
	private JTextField tfCor;
	private JLabel label;
	private JLabel lblCarroNovo;
	private JLabel lblCarroUsado;
	private JTextField tfCarroNovo;
	private JTextField tfCarroUsado;
	private JTextField tfProprietario;
	private JButton btnNewButton;
	private JTextField tfId;

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
		setResizable(false);
		setTitle("Concessionaria Smart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 256);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMarca = new JLabel("Marca:");
		lblMarca.setForeground(new Color(0, 255, 127));
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMarca.setBounds(20, 76, 72, 14);
		contentPane.add(lblMarca);
		
		lblCpf = new JLabel("Cor:");
		lblCpf.setForeground(new Color(0, 255, 127));
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCpf.setBounds(20, 124, 67, 18);
		contentPane.add(lblCpf);
		
		tfMarca = new JTextField();
		tfMarca.setColumns(10);
		tfMarca.setBounds(87, 75, 86, 20);
		contentPane.add(tfMarca);
		
		tfModelo = new JTextField();
		tfModelo.setColumns(10);
		tfModelo.setBounds(87, 101, 86, 20);
		contentPane.add(tfModelo);
		
		lblCor = new JLabel("Proprietario:");
		lblCor.setForeground(new Color(0, 255, 127));
		lblCor.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCor.setBounds(217, 126, 111, 14);
		contentPane.add(lblCor);
		
		tfCor = new JTextField();
		tfCor.setColumns(10);
		tfCor.setBounds(87, 125, 86, 20);
		contentPane.add(tfCor);
		
		label = new JLabel("Modelo:");
		label.setForeground(new Color(0, 255, 127));
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(20, 100, 67, 18);
		contentPane.add(label);
		
		lblCarroNovo = new JLabel("Carro novo:");
		lblCarroNovo.setForeground(new Color(0, 255, 127));
		lblCarroNovo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCarroNovo.setBounds(217, 74, 111, 18);
		contentPane.add(lblCarroNovo);
		
		lblCarroUsado = new JLabel("Carro usado:");
		lblCarroUsado.setForeground(new Color(0, 255, 127));
		lblCarroUsado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCarroUsado.setBounds(217, 100, 111, 18);
		contentPane.add(lblCarroUsado);
		
		tfCarroNovo = new JTextField();
		tfCarroNovo.setColumns(10);
		tfCarroNovo.setBounds(338, 75, 86, 20);
		contentPane.add(tfCarroNovo);
		
		tfCarroUsado = new JTextField();
		tfCarroUsado.setColumns(10);
		tfCarroUsado.setBounds(338, 101, 86, 20);
		contentPane.add(tfCarroUsado);
		
		tfProprietario = new JTextField();
		tfProprietario.setColumns(10);
		tfProprietario.setBounds(338, 125, 86, 20);
		contentPane.add(tfProprietario);
		
		JTextPane txtpnVenderCarro = new JTextPane();
		txtpnVenderCarro.setText("                                 Vender carro");
		txtpnVenderCarro.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnVenderCarro.setBackground(new Color(152, 251, 152));
		txtpnVenderCarro.setBounds(8, 11, 434, 40);
		contentPane.add(txtpnVenderCarro);
		
		btnNewButton = new JButton("Vender");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Carro carro = new Carro(tfMarca.getText(), tfModelo.getText(), tfCor.getText(), tfCarroNovo.getText(), tfCarroUsado.getText(), Integer.parseInt(tfProprietario.getText()));
				carro.persisteCarro();
				Estoque estoque = new Estoque(Integer.parseInt(tfId.getText()));
				estoque.decrementaEstoque();
				Sessao sessao = new Sessao();
				sessao.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(0, 255, 127));
		btnNewButton.setBounds(290, 198, 123, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblCdigoDoEstoque = new JLabel("C\u00F3digo do estoque:");
		lblCdigoDoEstoque.setForeground(new Color(0, 255, 127));
		lblCdigoDoEstoque.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCdigoDoEstoque.setBounds(20, 202, 170, 19);
		contentPane.add(lblCdigoDoEstoque);
		
		tfId = new JTextField();
		tfId.setColumns(10);
		tfId.setBounds(183, 201, 99, 20);
		contentPane.add(tfId);
	}
}