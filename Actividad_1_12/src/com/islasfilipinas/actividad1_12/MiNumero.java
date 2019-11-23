package com.islasfilipinas.actividad1_12;

public class MiNumero {

private int miNumero;

MiNumero(int miNumero){
	
	if(miNumero>100) {
		new TooHighNumberException("numero fuera de rango,introduzca un valor entre 0-100");
	}
	else {
		this.miNumero = miNumero;
	}
}

public void setMiNumero(int miNumero) {
	if(miNumero>100) {
		new TooHighNumberException("numero fuera de rango,introduzca un valor entre 0-100");
	}
	else {
		this.miNumero = miNumero;
	}
	
}

}