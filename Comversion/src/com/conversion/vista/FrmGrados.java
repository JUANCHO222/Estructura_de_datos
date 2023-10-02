package com.conversion.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.conversion.modelos.ConversionTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class FrmGrados extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;
	
	private JComboBox cmbSeleccion;
    private JButton btnSalir;
    private JButton btncalcular;
    private JButton btnNuevo;
    private JTextArea txtResultados;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmGrados frame = new FrmGrados();
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
	public FrmGrados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversion de temperaturas \r\n");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(216, 11, 221, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa una cantidad");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(28, 74, 124, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Elige una opci\u00F3n");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(30, 112, 98, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Resultados");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBounds(28, 151, 71, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(210, 71, 103, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		cmbSeleccion = new JComboBox();
		cmbSeleccion.setModel(new DefaultComboBoxModel(new String[] {"--Selecciona--", "C\u00B0 -- F\u00B0", "C\u00B0 -- K\u00B0", "F\u00B0 -- C\u00B0", "F\u00B0 -- K\u00B0", "K\u00B0 -- C\u00B0", "K\u00B0 -- F\u00B0"}));
		cmbSeleccion.setToolTipText("");
		cmbSeleccion.setBounds(210, 108, 103, 22);
		contentPane.add(cmbSeleccion);
		
		btnNuevo = new JButton("Nuevo\r\n");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbSeleccion.setSelectedIndex(0);
				txtCantidad.setText(nullX);
			    txtResultados.setText(null);
			
			}
		});
		btnNuevo.setBounds(0, 216, 89, 23);
		contentPane.add(btnNuevo);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(348, 216, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnCalcular = new JButton("Calcular\r\n");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConversionTemperatura venta = new ConversionTemperatura();
	    		
	    		venta.setSeleccion(cmbSeleccion.getSelectedIndex());
	    		try {
		    		venta.setCantidad(Double.parseDouble(txtCantidad.getText()));
	    		}catch(NumberFormatException error) {
	    			JOptionPane.showMessageDialog(rootPane, "No debe estar en blanco");
	    			
	    			txtCantidad.requestFocus();
	    		}catch(ArrayIndexOutOfBoundsException e1) {
	    			
	    		}
	    		
	    		txtResultados.setText(venta.CalcularTemperatura());
			}
		});
		btnCalcular.setBounds(173, 216, 89, 23);
		contentPane.add(btnCalcular);
		
		txtResultados = new JTextArea();
		txtResultados.setBounds(210, 146, 292, 61);
		contentPane.add(txtResultados);
	}
}
