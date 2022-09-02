package br.senai.sp.jandira;

public class Calculo {
	

	public int multiplicador = 8;
	public int minimo = 5;
	public int maximo = 10;
	public int resultado = multiplicador * minimo;
	
	
	public void getCalculo () {
		
		while(minimo <= maximo) {
			System.out.println(multiplicador + "x" + minimo + "=" + resultado);
			minimo++;
		}
    
  }
}