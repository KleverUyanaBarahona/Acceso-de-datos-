package com.islasfilipinas.actividad1_12;

import javax.swing.JOptionPane;

public class TooHighNumberException extends Exception {

	public TooHighNumberException(String string) {
		JOptionPane.showMessageDialog(null, string);
	}

}