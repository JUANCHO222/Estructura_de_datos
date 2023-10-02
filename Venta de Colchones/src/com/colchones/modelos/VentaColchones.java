package com.colchones.modelos;

import javax.swing.JOptionPane;

public class VentaColchones {
	private int tipoColchon;
	private int cantidad;	
public void setTipoColchon(int tipoColchon ) {
	this.tipoColchon=tipoColchon;
}

public int getTipoColchon() {
	return tipoColchon;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public String CalcularVenta() {
	int individual = 800;
	int matrimonial = 1200;
	int kingSize = 1700;
	double precio=0;
	int porcentaje=0;
	int ganancia;
	double descuento=0;
	double precioD=0;
	
	
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
			
			return "USTED COMPRO\n"+  cantidad + "COLCHON(ES) INDIVUDUAL/LES\n\n"+
				"CANTIDAD SIN DESCUENTO: $"+precio + "\n\n"+"CANTIDAD  CON DESCUENTO: $"
				+ precioD +"\n\n--GANANCIAS DEL PROVEEDOR--\n"+"GANACIAS NETAS: $"+porcentaje*cantidad+"\n"
	+ "GANACIAS CON DESCUENTO: $"+((porcentaje*cantidad)-descuento);
			
		}else {
            precioD=precio-descuento;
			
			System.out.println("35%venta al cliente con descuento: " + precioD);
			
			return "USTED COMPRO\n"+  cantidad + "COLCHON(ES) INDIVUDUAL/LES\n\n"+		
					"CANTIDAD SIN DESCUENTO: $"+precio + "\n\n"+"CANTIDAD CON DESCUENTO: $"
					+ precioD +"\n\n--GANANCIAS DEL PROVEEDOR--\n"+"GANACIAS NETAS: $"+porcentaje*cantidad+"\n"
		+ "GANACIAS CON DESCUENTO: $"+((porcentaje*cantidad)-descuento);
			
			
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
			
			return "USTED COMPRO\n"+  cantidad + "COLCHON(ES) MATRIMONIAL/LES\n\n"+		
				"CANTIDAD SIN DESCUENTO: $"+precio + "\n\n"+"CANTIDAD CON DESCUENTO: $"
				+ precioD +"\n\n--GANANCIAS DEL PROVEEDOR--\n"+"GANACIAS NETAS: $"+porcentaje*cantidad+"\n"
	+ "GANACIAS CON DESCUENTO: $"+((porcentaje*cantidad)-descuento);
			
		}else {
			descuento=precio*.35;
			precioD=precio-descuento;
			
			System.out.println("35%venta al cliente con descuento: " + precioD);
			
			return "USTED COMPRO\n"+  cantidad + "COLCHON(ES) MATRIMONIAL/LES\n\n"+		
					"CANTIDAD SIN DESCUENTO: $"+precio + "\n\n"+"CANTIDADR CON DESCUENTO: $"
					+ precioD +"\n\n--GANANCIAS DEL PROVEEDOR--\n"+"GANACIAS NETAS: $"+porcentaje*cantidad+"\n"
		+ "GANACIAS CON DESCUENTO: $"+((porcentaje*cantidad)-descuento);
			
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
			
			   return "USTED COMPRO\n"+  cantidad + "COLCHON(ES) kingSize/S\n\n"+
				"CANTIDAD A PAGAR SIN DESCUENTO: $"+precio + "\n\n"+"CANTIDAD A PAGAR CON DESCUENTO: $"
				+ precioD +"\n\n--GANANCIAS DEL PROVEEDOR--\n"+"GANACIAS NETAS: $"+porcentaje*cantidad+"\n"
	+ "GANACIAS CON DESCUENTO: $"+((porcentaje*cantidad)-descuento);
		}else {
			descuento=precio*.35;
			precioD=precio-descuento;
			
			System.out.println("35%venta al cliente con descuento: " + precioD);
			
			   return "USTED COMPRO\n"+  cantidad + "COLCHON(ES) kingSize/S\n\n"+
					"CANTIDAD SIN DESCUENTO: $"+precio + "\n\n"+"CANTIDAD CON DESCUENTO: $"
					+ precioD +"\n\n--GANANCIAS DEL PROVEEDOR--\n"+"GANACIAS NETAS: $"+porcentaje*cantidad+"\n"
		+ "GANACIAS CON DESCUENTO: $"+((porcentaje*cantidad)-descuento);
			
		}

		
	}else {
		JOptionPane.showMessageDialog(null, "Debe Seleccionar una opción");

	}
	
	   return "";
}
 
}
