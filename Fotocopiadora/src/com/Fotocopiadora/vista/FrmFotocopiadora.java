package com.Fotocopiadora.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Fotocopiadora.modelos.precioCopias;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class FrmFotocopiadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextArea txtResultado;
	private JButton btnCalcular;
	private JButton btnSalir;
	private JButton btnNuevo;
	short dato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmFotocopiadora frame = new FrmFotocopiadora();
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
	public FrmFotocopiadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 959, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    btnNuevo = new JButton("Nuevo\r\n");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCantidad.setText(null);
			    txtResultado.setText(null);
			}
		});
		btnNuevo.setBounds(256, 316, 89, 23);
		contentPane.add(btnNuevo);
		
	    btnSalir = new JButton("Salir\r\n");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(659, 316, 89, 23);
		contentPane.add(btnSalir);
		
		txtResultado = new JTextArea();
		txtResultado.setBounds(264, 367, 481, 101);
		contentPane.add(txtResultado);
		
		btnCalcular = new JButton("Calcular\r\n");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	    		
					dato = Short.parseShort(txtCantidad.getText());
					precioCopias precio = new precioCopias();
		    		precio.setCopia(dato);
		    		
		    		txtResultado.setText("Fotocopias Adolfo precio\n" + precio.getCopia());
		    		
			}
		});
		btnCalcular.setBounds(463, 316, 89, 23);
		contentPane.add(btnCalcular);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(404, 229, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(".::: Papeleria Don Adolfo :::.\r\n");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(369, 11, 320, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Ingrese la cantidad de copias ----->");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(171, 232, 224, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Condiciones de Precio a cobrar\r\n\r\n\r\n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setBounds(171, 85, 210, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("a) Las primeras copias siempre costar\u00E1n 30 centavos sin importar si son m\u00E1s de 50 copias.\r\n");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(171, 119, 518, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("b) A partir de la copia 51 a la 100 costar\u00E1n 20 centavos.\r\n");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(171, 138, 437, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("c) Si son m\u00E1s de 100 copias el excedente costaran 10 centavos cada una.");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(171, 160, 437, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(FrmFotocopiadora.class.getResource("/com/Fotocopiadora/resourses/bloodborne-2.jpg")));
		lblNewLabel_6.setBounds(0, 0, 943, 681);
		contentPane.add(lblNewLabel_6);
	}
}
