package com.Fotocopiadora.modelos;
import javax.swing.JOptionPane;

public class precioCopias {
    private double copia;
    
    double res1,res2,res3;

    
    public double getRes1() {
		return res1;
	}

	public void setRes1(double res1) {
		this.res1 = res1;
	}

	public double getRes2() {
		return res2;
	}

	public void setRes2(double res2) {
		this.res2 = res2;
	}

	public double getRes3() {
		return res3;
	}

	public void setRes3(double res3) {
		this.res3 = res3;
	}

	public void setCopia(double copia){
        this.copia = copia;
    }
    
    public double getCopia(){
        if(copia<=50){
            copia=copia*0.30;
        }else if(copia<=100){
            res1=50*0.30;
            res2=copia-50;
            res2=res2*0.20;
            copia=res1+res2;
        }else if(copia>100){
            res1=50*0.30;
            res2=50*0.20;
            res3=copia-100;
            res3=res3*0.10;
            copia=res1+res2+res3;
        }
        return copia;
    }

}






