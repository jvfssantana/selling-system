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
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem;
	private JMenu menu_1;
	private JMenuItem menuItem_1;
	private JMenu menu_2;
	private JMenuItem menuItem_2;
	private JLabel label;
	private JLabel lblCpf;
	private JTextField tfNome;
	private JTextField tfCpf;
	private JLabel label_2;
	private JTextField tfEmail;
	private JLabel label_3;
	private JTextField textField_3;

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
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 388, 21);
		contentPane.add(menuBar);
		
		menu = new JMenu("Cadastrar");
		menuBar.add(menu);
		
		menuItem = new JMenuItem("Cadastrar");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cliente cliente = new Cliente(tfNome.getText(), tfCpf.getText(), tfEmail.getText());
				cliente.persisteCliente();
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
		
		label = new JLabel("Nome:");
		label.setForeground(new Color(0, 255, 127));
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(10, 76, 72, 14);
		contentPane.add(label);
		
		lblCpf = new JLabel("Cpf:");
		lblCpf.setForeground(new Color(0, 255, 127));
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCpf.setBounds(10, 101, 67, 18);
		contentPane.add(lblCpf);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(87, 75, 86, 20);
		contentPane.add(tfNome);
		
		tfCpf = new JTextField();
		tfCpf.setColumns(10);
		tfCpf.setBounds(87, 102, 86, 20);
		contentPane.add(tfCpf);
		
		label_2 = new JLabel("Email:");
		label_2.setForeground(new Color(0, 255, 127));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(10, 130, 72, 14);
		contentPane.add(label_2);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(87, 128, 86, 20);
		contentPane.add(tfEmail);
		
		label_3 = new JLabel("ID:");
		label_3.setForeground(new Color(0, 255, 127));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_3.setBounds(10, 155, 35, 14);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(87, 153, 86, 20);
		contentPane.add(textField_3);
	}

}