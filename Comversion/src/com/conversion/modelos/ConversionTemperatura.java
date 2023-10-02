package com.conversion.modelos;
import javax.swing.JOptionPane;


public class ConversionTemperatura {
	private int Seleccion;
	private double Cantidad;
	
	
	public int getSeleccion() {
		return Seleccion;
	}


	public void setSeleccion(int seleccion) {
		Seleccion = seleccion;
	}


	public double getCantidad() {
		return Cantidad;
	}


	public void setCantidad(double cantidad) {
		Cantidad = cantidad;
	}


	public String CalcularTemperatura() {
		double temperatura;
		
		if(Seleccion == 1) {
		     temperatura = Cantidad * 9/5 + 32;
			return "Es de " + temperatura + "° F";
			
		}else if(Seleccion == 2){
			temperatura = Cantidad + 273.15 ;
			return "Es de " + temperatura + "° K";
		}else if(Seleccion == 3 ){
			temperatura = (Cantidad - 32) * 5/9 ;
			return"Es de " + temperatura + "° C";
			
		}else if(Seleccion == 4) {
			temperatura = (Cantidad - 32) * 5/9 + 273.15;
			return "Es de " + temperatura + "° K";

		}else if(Seleccion == 5) {
			temperatura = Cantidad - 273.15;
			return "Es de " + temperatura + "° C";

		}else if(Seleccion == 6) {
			temperatura = (Cantidad - 273.15) * 9/5 + 32 ;
			return "Es de " + temperatura + "° F";

		}
return "";
	}

}
