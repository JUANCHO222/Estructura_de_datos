package com.cangrejito.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCobroHoras extends JFrame {

	private JPanel contentPane;
	private JTextField txtHora2;
	private JTextField txtMinuto2;
	private JComboBox cmbSeleccion;
	private JTextArea txtResultado;
	private JTextField txtHora1;
	private JTextField txtMinuto1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCobroHoras frame = new FrmCobroHoras();
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
	public FrmCobroHoras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 527);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ESTACIONAMIENTO \"CANGREJITO\"");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(249, 26, 331, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hora de Entrada");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(313, 137, 137, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hora de Salida");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(313, 214, 137, 14);
		contentPane.add(lblNewLabel_2);
		
		cmbSeleccion = new JComboBox();
		cmbSeleccion.setModel(new DefaultComboBoxModel(new String[] {"--Seleccione Dia--", "Lunes", "Martes", "Miercoles", "Jueves ", "Viernes ", "Sabado", "Domingo", "Suscripcion"}));
		cmbSeleccion.setBounds(313, 77, 137, 22);
		contentPane.add(cmbSeleccion);
		
		txtHora2 = new JTextField();
		txtHora2.setBounds(243, 239, 86, 20);
		contentPane.add(txtHora2);
		txtHora2.setColumns(10);
		
		txtMinuto2 = new JTextField();
		txtMinuto2.setBounds(393, 239, 86, 20);
		contentPane.add(txtMinuto2);
		txtMinuto2.setColumns(10);
		
		txtResultado = new JTextArea();
		txtResultado.setBounds(149, 270, 449, 144);
		contentPane.add(txtResultado);
		
		JButton btnNuevo = new JButton("Nuevo\r\n");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbSeleccion.setSelectedIndex(0);
				txtHora1.setText(null);
				txtHora2.setText(null);
				txtMinuto1.setText(null);
				txtMinuto2.setText(null);
				txtResultado.setText(null);
			}
		});
		btnNuevo.setBounds(149, 455, 89, 23);
		contentPane.add(btnNuevo);
		
		//Boton de salir
		JButton btnSalir = new JButton("Salir\r\n");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(507, 455, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnCobrar = new JButton("Guardar\r\n");
		btnCobrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Seleccion;
				int costo = 0 ;     //Sacar la cantidad a pagar
				int Hora1, Minuto1; //Entrada
				int Hora2, Minuto2; //Salida
				int contadorHoras=1; //Horas transcurridas en el estacionamiento 
				
				int tiempoTotal=0;
		        int tiempoTotal2=0;
		        int minutos=1;
		        int minutos2=1;
		        int cantidadPago ;
		 
		        
		        		        
		        		        
		        		  
		        		      
		        		        //variable para calcular el costo a pagar  
                           Seleccion = cmbSeleccion.getSelectedIndex();
		        		        
		        		        //asignarle un precio por hora dependiendo el dia
		        		        if (Seleccion == 1 || Seleccion ==2 || Seleccion ==3){
		        		          costo =10;
		        		        }else if(Seleccion==4 || Seleccion==5){
		        		          costo = 15;
		        		        }else if(Seleccion==6 || Seleccion ==7){
		        		          costo = 20;
		        		        }else {
		        		          JOptionPane.showMessageDialog(rootPane, "SELECCIONE UN DIA O ACASO NO SABE ¿QUE ES UN DIA? JAJAJA");
		        		        }
		        		        
		        		        //calcular dependiendo el tiempo el precio a pagar
		        		        Hora1 = Integer.parseInt(txtHora1.getText());
		        		        Minuto1 = Integer.parseInt(txtMinuto1.getText());
		        		        Hora2 = Integer.parseInt(txtHora2.getText());
		        		        Minuto2 = Integer.parseInt(txtMinuto2.getText());
		        		        //---11------------------------------------
		        		        int precio_a_Pagar=0;
		        		    
		        		        int minutos1=0;
		        		        int contadorMinutos1=Minuto1;
		        		        
		        		        //----------------------------------------
		        		        //preguntar si quieren membresia
		        		        String [] botones = { "SI", "NO"};
		        		        
		        		        //validar datos correctos
		        		        if (Hora1 >=1 && Hora1 <25 && Minuto1 >=0 && Minuto1 <=60) {  
		        		          
		        		        
		        		        if(contadorHoras<=-1) {
		        		          //calculamos el total de horas estacionado
		        		          tiempoTotal=contadorHoras+24;
		        		          //calculamos cuantos minutos
		        		        
		        		          txtResultado.setText("HORAS ESTACIONADO : " + tiempoTotal +"\nMINUTOS ESTACIONADO : " );
		        		          
		        		        }else if(contadorHoras>=1) {
		        		          //calculamos el total de horas estacionado
		        		          tiempoTotal2= Hora2-Hora1;
		        		          //calculamos cuantos minutos
		        		          
		        		          int minutosTotal = Minuto1-Minuto2 + 60;
		        		          
		        		          if (minutos1<=60) {
		        		            contadorMinutos1=Math.abs(Minuto1-Minuto2-60);
		        		          }
		        		          if(Minuto1==0 && Minuto2==0) {
		        		            
		        		          contadorMinutos1 = 0;
		        		          }

		        		
		        		//--hacemos el proceso de calcular el dinero a pagar--\\
		        		          //conversion de horas a minutos para sacar precios
		        		          int minVerdaderos;
		        		          int horasVerdaderas;
		        		          double residuoMinutos;
		        		        minVerdaderos = (tiempoTotal2 *60)+contadorMinutos1;
		        		        horasVerdaderas = (minVerdaderos / 60);
		        		        residuoMinutos = (minVerdaderos % 60);
		        		        //aqui avisamos si se pasa de 5 min se le cobra una hora
		        		        if(residuoMinutos>=5) {
		        		          JOptionPane.showMessageDialog(rootPane, "DESPUES DE 15 MINUTOS SE LE COBRARÁ UNA HORA EXTRA PORQUE LOS QUE TRABAJAMOS AQUI NECESITAMOS COMER");
		        		          horasVerdaderas=horasVerdaderas+1;
		        		          System.out.println(horasVerdaderas);
		        		          
		        		        }
		        		        
		        		        //preguntamos si desea la membresia
		        		          if(tiempoTotal2>=8) {
		        		            int variable = JOptionPane.showOptionDialog (rootPane, "¿DESEAS TENER MAS TIEMPO POR ESO COMPRA NUESTRA "
		        		                + " MEMBRESIA POR TAN SOLO $1000 MXN? SI LO COMPRA SE LLEVARA UN ADOLFO GRATIS", "Membresia",
		        		                JOptionPane.YES_NO_CANCEL_OPTION,
		        		                JOptionPane.WARNING_MESSAGE, null/*icono*/, botones, botones[0]);  
		        		            if(variable==0) {
		        		              
		        		              precio_a_Pagar= horasVerdaderas*costo + 1000;
		        		            }  
		        		            }else  if(tiempoTotal<=7){
		        		              precio_a_Pagar= horasVerdaderas*costo;  
		        		          }
		        		    
		        		          //---------------------------------------------------------------------------------------------\\
		        		          txtResultado.setText("-----TICKET DE ESTACIONAMIENTO----- \n"
		        		              + "HORAS ESTACIONADO : " + horasVerdaderas +"\nMINUTOS ESTACIONADO : "
		        		              +residuoMinutos+"\nTOTAL A PAGAR: $" + (precio_a_Pagar));
		        		        }  
		        		        }else {
		        		          JOptionPane.showMessageDialog(rootPane, "INGRESE UNA HORA, NO UN DIA NO SEA CHEEMS");
		        		        }    
		        		      }  
		        		      });
		        	
		btnCobrar.setBounds(339, 455, 89, 23);
		contentPane.add(btnCobrar);
		
		txtHora1 = new JTextField();
		txtHora1.setBounds(243, 162, 86, 20);
		contentPane.add(txtHora1);
		txtHora1.setColumns(10);
		
		txtMinuto1 = new JTextField();
		txtMinuto1.setBounds(393, 162, 86, 20);
		contentPane.add(txtMinuto1);
		txtMinuto1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(FrmCobroHoras.class.getResource("/com/cangrejito/resources/casa.png")));
		lblNewLabel_3.setBounds(-138, 0, 884, 526);
		contentPane.add(lblNewLabel_3);
	}
}
