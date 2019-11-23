package com.islasfilipinas.actividad1_12;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {
public static void main (String args[]) throws TooHighNumberException  {
	
	boolean isValid=false;
	for (int i=0;i<5;i++) {
		isValid=false;
		while(!isValid) {
			
			try {
				int num=Integer.parseInt(JOptionPane.showInputDialog(null, "INTRODUCE UN NUMERO "+(i+1)));
				MiNumero numero= new MiNumero(num);
				isValid=true;
			}
			catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Has introducido un caracter ERRONEO introduzca solo NUMEROS ENTEROS");
				
			}
			catch(InputMismatchException ex) {
				JOptionPane.showMessageDialog(null,"Has introducido un caracter ERRONEO introduce solo caracteres");
				
			}
		}
	}
	
}
}

