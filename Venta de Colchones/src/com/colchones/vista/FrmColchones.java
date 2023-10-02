package com.colchones.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.colchones.modelos.VentaColchones;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FrmColchones extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidadColchones;
	private JComboBox cmbTipoColchon;
	private JTextArea txtResultados;
	private JButton btnCalcularVenta;
	private JButton btnNuevaVenta;
	private JButton btnSalir;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmColchones frame = new FrmColchones();
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
	public FrmColchones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1375, 777);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(".:Colchones El Rey:.\r\n");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(357, 11, 214, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(".:COSTOS:.\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(59, 88, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("INDIVIDUAL\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(59, 138, 141, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MATRIMONIAL\r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(59, 177, 141, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("KING SIZE\r\n");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(59, 224, 141, 14);
		contentPane.add(lblNewLabel_4);
		
		cmbTipoColchon = new JComboBox();
		cmbTipoColchon.setModel(new DefaultComboBoxModel(new String[] {"--SELECCIONE EL TIPO DE COLCHON--", "INDIVIDUAL", "MATRIMONIAL ", "KING SIZE"}));
		cmbTipoColchon.setBounds(288, 86, 214, 22);
		contentPane.add(cmbTipoColchon);
		
	    btnCalcularVenta = new JButton("Calcular Venta\r\n");
	    btnCalcularVenta.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		VentaColchones venta = new VentaColchones();
	    		
	    		venta.setTipoColchon(cmbTipoColchon.getSelectedIndex());
	    		try {
		    		venta.setCantidad(Integer.parseInt(txtCantidadColchones.getText()));
	    		}catch(NumberFormatException error) {
	    			JOptionPane.showMessageDialog(rootPane, "Cantidad a comprar no debe estar vacio");
	    			
	    			txtCantidadColchones.requestFocus();
	    		}catch(ArrayIndexOutOfBoundsException e1) {
	    			
	    		}
	    		
	    		txtResultados.setText(venta.CalcularVenta());
	    		/*
	    		int individual = 800;
	    		int matrimonial = 1200;
	    		int kingSize = 1700;
	    		int cantidad;
	    		int tipoColchon;
	    		double precio=0;
	    		int porcentaje=0;
	    		int ganancia;
	    		double descuento=0;
	    		double precioD=0;
	    		
	    		
	    		cantidad=Integer.parseInt(txtCantidadColchones.getText());
				tipoColchon = cmbTipoColchon.getSelectedIndex();
				
				if(tipoColchon == 1) {
					precio = (0.75*(individual)+individual)*cantidad ;
					porcentaje = 600;
					ganancia=cantidad*porcentaje;
					System.out.println("venta al cliente"+ precio);
					System.out.println("Ganacia"+ganancia);
					
					if(cantidad>=1 && cantidad<=5) {
						descuento=precio*0.15;
						precioD=precio-descuento;
						System.out.println("venta al cliente con descuentos"+ precioD);
						
						txtResultados.setText("USTED COMPRO\n"+  cantidad + "COLCHON(ES) INDIVUDUAL/LES\n\n"+
							"CANTIDAD SIN DESCUENTO: $"+precio + "\n\n"+"CANTIDAD  CON DESCUENTO: $"
							+ precioD +"\n\n--GANANCIAS DEL PROVEEDOR--\n"+"GANACIAS NETAS: $"+porcentaje*cantidad+"\n"
				+ "GANACIAS CON DESCUENTO: $"+((porcentaje*cantidad)-descuento));
						
					}else {
                        precioD=precio-descuento;
						
						System.out.println("35%venta al cliente con descuento: " + precioD);
						
						txtResultados.setText("USTED COMPRO\n"+  cantidad + "COLCHON(ES) INDIVUDUAL/LES\n\n"+		
								"CANTIDAD SIN DESCUENTO: $"+precio + "\n\n"+"CANTIDAD CON DESCUENTO: $"
								+ precioD +"\n\n--GANANCIAS DEL PROVEEDOR--\n"+"GANACIAS NETAS: $"+porcentaje*cantidad+"\n"
					+ "GANACIAS CON DESCUENTO: $"+((porcentaje*cantidad)-descuento));
						
						
					}
	
					
					
				}else if(tipoColchon == 2){
					precio = (0.75*(matrimonial)+matrimonial)*cantidad;
					porcentaje = 900;
					ganancia=cantidad*porcentaje;
					System.out.println("venta al cliente"+ precio);
					System.out.println("Ganacia"+ganancia);
					
					if(cantidad>=1 && cantidad<=5) {
						descuento=precio*0.20;
						precioD=precio-descuento;
						System.out.println("venta al cliente con descuentos"+ precioD);
						
						txtResultados.setText("USTED COMPRO\n"+  cantidad + "COLCHON(ES) MATRIMONIAL/LES\n\n"+		
							"CANTIDAD SIN DESCUENTO: $"+precio + "\n\n"+"CANTIDAD CON DESCUENTO: $"
							+ precioD +"\n\n--GANANCIAS DEL PROVEEDOR--\n"+"GANACIAS NETAS: $"+porcentaje*cantidad+"\n"
				+ "GANACIAS CON DESCUENTO: $"+((porcentaje*cantidad)-descuento));
						
					}else {
						descuento=precio*.35;
						precioD=precio-descuento;
						
						System.out.println("35%venta al cliente con descuento: " + precioD);
						
						txtResultados.setText("USTED COMPRO\n"+  cantidad + "COLCHON(ES) MATRIMONIAL/LES\n\n"+		
								"CANTIDAD SIN DESCUENTO: $"+precio + "\n\n"+"CANTIDADR CON DESCUENTO: $"
								+ precioD +"\n\n--GANANCIAS DEL PROVEEDOR--\n"+"GANACIAS NETAS: $"+porcentaje*cantidad+"\n"
					+ "GANACIAS CON DESCUENTO: $"+((porcentaje*cantidad)-descuento));
						
					}

				
					
				}else if(tipoColchon == 3) {
					precio = (0.75*(kingSize)+kingSize)*cantidad ;
					porcentaje = 1275;
					ganancia=cantidad*porcentaje;
					System.out.println("venta al cliente"+ precio);
					System.out.println("Ganacia"+ganancia);
					
					if(cantidad>=1 && cantidad<=5) {
						descuento=precio*0.25;
						precioD=precio-descuento;
						System.out.println("venta al cliente con descuentos"+ precioD);
						
						txtResultados.setText("USTED COMPRO\n"+  cantidad + "COLCHON(ES) kingSize/S\n\n"+
							"CANTIDAD A PAGAR SIN DESCUENTO: $"+precio + "\n\n"+"CANTIDAD A PAGAR CON DESCUENTO: $"
							+ precioD +"\n\n--GANANCIAS DEL PROVEEDOR--\n"+"GANACIAS NETAS: $"+porcentaje*cantidad+"\n"
				+ "GANACIAS CON DESCUENTO: $"+((porcentaje*cantidad)-descuento));
					}else {
						descuento=precio*.35;
						precioD=precio-descuento;
						
						System.out.println("35%venta al cliente con descuento: " + precioD);
						
						txtResultados.setText("USTED COMPRO\n"+  cantidad + "COLCHON(ES) kingSize/S\n\n"+
								"CANTIDAD SIN DESCUENTO: $"+precio + "\n\n"+"CANTIDAD CON DESCUENTO: $"
								+ precioD +"\n\n--GANANCIAS DEL PROVEEDOR--\n"+"GANACIAS NETAS: $"+porcentaje*cantidad+"\n"
					+ "GANACIAS CON DESCUENTO: $"+((porcentaje*cantidad)-descuento));
						
					}

					
				}else {
					JOptionPane.showMessageDialog(rootPane, "Debe Seleccionar una opción");

				}
*/
	    	}
	    });
		btnCalcularVenta.setBounds(59, 704, 89, 23);
		contentPane.add(btnCalcularVenta);
		
		btnNuevaVenta = new JButton("Nueva Venta");
		btnNuevaVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cmbTipoColchon.setSelectedIndex(0);
				txtCantidadColchones.setText(null);
				txtResultados.setText(null);
			}
		});
		btnNuevaVenta.setBounds(430, 704, 89, 23);
		contentPane.add(btnNuevaVenta);
		
	    btnSalir = new JButton("Salir\r\n");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(758, 704, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_5 = new JLabel("CANTIDAD---->");
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(59, 276, 114, 14);
		contentPane.add(lblNewLabel_5);
		
		txtCantidadColchones = new JTextField();
		txtCantidadColchones.setBounds(183, 275, 119, 20);
		contentPane.add(txtCantidadColchones);
		txtCantidadColchones.setColumns(10);
		
	    txtResultados = new JTextArea();
		txtResultados.setBounds(1022, 8, 337, 730);
		contentPane.add(txtResultados);
		
		JLabel lblNewLabel_6 = new JLabel("$800.00\r\n");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(210, 140, 77, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("$1200.00\r\n");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(210, 179, 77, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("$1700.00");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(210, 226, 77, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon(FrmColchones.class.getResource("/com/colchones/resources/ea7f8b0e81b29a4888cb98c6fd0dfb38.jpg")));
		lblNewLabel_9.setBounds(0, 0, 1022, 738);
		contentPane.add(lblNewLabel_9);
	}
}
