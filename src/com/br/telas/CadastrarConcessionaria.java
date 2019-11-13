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
import com.br.classes.Concessionaria;

public class CadastrarConcessionaria extends JFrame {

	private static final long serialVersionUID = 1L;
	
	protected JPanel contentPane;
	protected JTextField tfNome;
	protected JTextField tfCidade;
	protected JTextField tfCep;
	protected JTextField tfEmail;
	protected JTextField tfEndereco;
	protected JTextField tfEstado;
	protected JTextField tfTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarConcessionaria frame = new CadastrarConcessionaria();
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
	public CadastrarConcessionaria() {
		setTitle("Concession\u00E1ria Smart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 137, 52, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEndereo = new JLabel("Cidade");
		lblEndereo.setBounds(10, 162, 52, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblCep = new JLabel("Cep");
		lblCep.setBounds(10, 188, 52, 14);
		contentPane.add(lblCep);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 220, 52, 14);
		contentPane.add(lblEmail);
		
		JLabel label_2 = new JLabel("Endere\u00E7o");
		label_2.setBounds(201, 137, 64, 14);
		contentPane.add(label_2);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(201, 162, 64, 14);
		contentPane.add(lblEstado);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(201, 188, 64, 14);
		contentPane.add(lblTelefone);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Concessionaria concessionaria = new Concessionaria(tfNome.getText(), tfEndereco.getText(), tfCidade.getText(), tfEstado.getText(), tfCep.getText(), tfTelefone.getText(), tfEmail.getText());
				concessionaria.persisteConcessionaria();
			}
		});
		
		btnBuscar.setBounds(201, 216, 89, 23);
		contentPane.add(btnBuscar);
		
		tfNome = new JTextField();
		tfNome.setBounds(70, 134, 121, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		tfCidade.setBounds(70, 159, 121, 20);
		contentPane.add(tfCidade);
		
		tfCep = new JTextField();
		tfCep.setColumns(10);
		tfCep.setBounds(70, 185, 121, 20);
		contentPane.add(tfCep);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(70, 217, 121, 20);
		contentPane.add(tfEmail);
		
		tfEndereco = new JTextField();
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(267, 134, 86, 20);
		contentPane.add(tfEndereco);
		
		tfEstado = new JTextField();
		tfEstado.setColumns(10);
		tfEstado.setBounds(267, 159, 86, 20);
		contentPane.add(tfEstado);
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(267, 185, 86, 20);
		contentPane.add(tfTelefone);
	}
}
