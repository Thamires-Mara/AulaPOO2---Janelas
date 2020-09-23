package br.com.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.controller.UserLoger;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginUser extends JFrame {

	protected static final Component ContentPane = null;
	private JPanel contentPane;
	private JTextField textFieldLogin;
	private JPasswordField passwordFieldSenha;
	private JTextField textFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUser frame = new LoginUser();
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
	public LoginUser() {
		setTitle("Janela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(50, 48, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(50, 89, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(117, 45, 207, 20);
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(117, 86, 207, 20);
		contentPane.add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		JButton btnNewButtonLogar = new JButton("Logar");
		btnNewButtonLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				UserLoger us = new UserLoger ();
				
			if (us.validacaoLogin (textFieldLogin. getText(), textFieldSenha.getText())) {
			
				JOptionPane . showMessageDialog (contentPane, " Ok, "  + textFieldLogin . getText () +  " Login efetuado! " );
			
		}else {
			
			JOptionPane . showMessageDialog (contentPane, " Desculpe, mas você errou o login ou a senha " , " Login negado! " , JOptionPane . ERROR_MESSAGE );

		}
		
		textFieldLogin . setText ( " " );
		textFieldSenha . setText ( " " );
			
				
				
			}
		});
		btnNewButtonLogar.setBounds(314, 196, 97, 41);
		contentPane.add(btnNewButtonLogar);
		
		
	}
}
