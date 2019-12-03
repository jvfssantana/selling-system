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

public class TelaCarro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem;
	private JMenu menu_1;
	private JMenuItem menuItem_1;
	private JMenu menu_2;
	private JMenuItem menuItem_2;
	private JLabel lblMarca;
	private JLabel lblCpf;
	private JTextField tfMarca;
	private JTextField tfModelo;
	private JLabel lblCor;
	private JTextField tfCor;
	private JLabel label_3;
	private JLabel label;
	private JLabel lblCarroNovo;
	private JLabel lblCarroUsado;
	private JTextField tfId;
	private JTextField tfCarroNovo;
	private JTextField tfCarroUsado;
	private JTextField tfProprietario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCarro frame = new TelaCarro();
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
	public TelaCarro() {
		setResizable(false);
		setTitle("Concessionaria Smart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 309);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 388, 21);
		contentPane.add(menuBar);
		
		menu = new JMenu("Cadastrar");
		menuBar.add(menu);
		
		menuItem = new JMenuItem("Cadastrar");
		menuItem.addActionListener(new ActionListener() {
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
		menu.add(menuItem);
		
		menu_1 = new JMenu("Atualizar");
		menuBar.add(menu_1);
		
		menuItem_1 = new JMenuItem("Atualizar");
		menu_1.add(menuItem_1);
		
		menu_2 = new JMenu("Excluir");
		menuBar.add(menu_2);
		
		menuItem_2 = new JMenuItem("Excluir");
		menu_2.add(menuItem_2);
		
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
		lblCor.setBounds(183, 130, 111, 14);
		contentPane.add(lblCor);
		
		tfCor = new JTextField();
		tfCor.setColumns(10);
		tfCor.setBounds(87, 125, 86, 20);
		contentPane.add(tfCor);
		
		label_3 = new JLabel("ID:");
		label_3.setForeground(new Color(0, 255, 127));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_3.setBounds(20, 153, 35, 14);
		contentPane.add(label_3);
		
		label = new JLabel("Modelo:");
		label.setForeground(new Color(0, 255, 127));
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(20, 100, 67, 18);
		contentPane.add(label);
		
		lblCarroNovo = new JLabel("Carro novo:");
		lblCarroNovo.setForeground(new Color(0, 255, 127));
		lblCarroNovo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCarroNovo.setBounds(183, 74, 111, 18);
		contentPane.add(lblCarroNovo);
		
		lblCarroUsado = new JLabel("Carro usado:");
		lblCarroUsado.setForeground(new Color(0, 255, 127));
		lblCarroUsado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCarroUsado.setBounds(183, 101, 111, 18);
		contentPane.add(lblCarroUsado);
		
		tfId = new JTextField();
		tfId.setColumns(10);
		tfId.setBounds(87, 153, 86, 20);
		contentPane.add(tfId);
		
		tfCarroNovo = new JTextField();
		tfCarroNovo.setColumns(10);
		tfCarroNovo.setBounds(290, 75, 86, 20);
		contentPane.add(tfCarroNovo);
		
		tfCarroUsado = new JTextField();
		tfCarroUsado.setColumns(10);
		tfCarroUsado.setBounds(290, 101, 86, 20);
		contentPane.add(tfCarroUsado);
		
		tfProprietario = new JTextField();
		tfProprietario.setColumns(10);
		tfProprietario.setBounds(290, 125, 86, 20);
		contentPane.add(tfProprietario);
	}

}