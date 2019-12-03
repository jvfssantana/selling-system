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
	private JTextField tfNovo;
	private JLabel lblId;
	private JTextField tfId;
	private JLabel lblCarroUsado;
	private JTextField tfUsado;
	private JLabel lblSobrenome;
	private JTextField tfModelo;
	private JLabel lblFuno;
	private JTextField tfCor;

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
		setBounds(100, 100, 419, 205);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 414, 21);
		contentPane.add(menuBar);
		
		menu = new JMenu("Cadastrar");
		menuBar.add(menu);
		
		menuItem = new JMenuItem("Cadastrar");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Estoque estoque = new Estoque(tfMarca.getText(), tfModelo.getText(), tfCor.getText(), tfNovo.getText(), tfUsado.getText());
				estoque.persisteEstoque();
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
		lblMarca.setBounds(10, 62, 72, 14);
		contentPane.add(lblMarca);
		
		lblCpf = new JLabel("Carro novo:");
		lblCpf.setForeground(new Color(0, 255, 127));
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCpf.setBounds(180, 89, 104, 18);
		contentPane.add(lblCpf);
		
		tfMarca = new JTextField();
		tfMarca.setColumns(10);
		tfMarca.setBounds(78, 61, 86, 20);
		contentPane.add(tfMarca);
		
		tfNovo = new JTextField();
		tfNovo.setColumns(10);
		tfNovo.setBounds(294, 90, 109, 20);
		contentPane.add(tfNovo);
		
		lblId = new JLabel("ID:");
		lblId.setForeground(new Color(0, 255, 127));
		lblId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblId.setBounds(10, 120, 72, 14);
		contentPane.add(lblId);
		
		tfId = new JTextField();
		tfId.setColumns(10);
		tfId.setBounds(78, 114, 86, 20);
		contentPane.add(tfId);
		
		lblCarroUsado = new JLabel("Carro usado:");
		lblCarroUsado.setForeground(new Color(0, 255, 127));
		lblCarroUsado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCarroUsado.setBounds(180, 118, 104, 14);
		contentPane.add(lblCarroUsado);
		
		tfUsado = new JTextField();
		tfUsado.setColumns(10);
		tfUsado.setBounds(294, 119, 109, 20);
		contentPane.add(tfUsado);
		
		lblSobrenome = new JLabel("Modelo:");
		lblSobrenome.setForeground(new Color(0, 255, 127));
		lblSobrenome.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSobrenome.setBounds(180, 60, 103, 18);
		contentPane.add(lblSobrenome);
		
		tfModelo = new JTextField();
		tfModelo.setColumns(10);
		tfModelo.setBounds(294, 61, 109, 20);
		contentPane.add(tfModelo);
		
		lblFuno = new JLabel("Cor:");
		lblFuno.setForeground(new Color(0, 255, 127));
		lblFuno.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFuno.setBounds(10, 91, 72, 14);
		contentPane.add(lblFuno);
		
		tfCor = new JTextField();
		tfCor.setColumns(10);
		tfCor.setBounds(78, 87, 86, 20);
		contentPane.add(tfCor);
	}
}