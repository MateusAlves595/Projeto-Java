package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Calculo {

	public int numero;
	public int minimo;
	public int maximo;
	public ArrayList<String> resultado = new ArrayList<String>();
	
	public ArrayList<String> getResultado() {
		
		while(minimo <= maximo) {
			resultado.add(numero + "x" + minimo + " = " + (numero * minimo));
			minimo++;
			
		}
		
		return resultado;
	}
	



}