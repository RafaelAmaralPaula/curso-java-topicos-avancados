package com.lovelacetenologia.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {

	public static void main(String[] args) {
		
		DecimalFormat format = new DecimalFormat("R$ #,##0.00");
		
		double valorProduto = 1300.59;
		
		
		System.out.println(format.format(valorProduto));
		
		
		String entrada = "R$ 50,34";
		
		try {
			
			double numero = format.parse(entrada).doubleValue();
			System.out.println("Numero : " + numero);
		
		} catch (ParseException e) {
			System.out.println("Entrada Invalida !'");	
		}
		
		
	 
		double valor = 50;
		
		BigDecimal decimal = new BigDecimal(valor);
		BigDecimal porcentagem = decimal.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
		
		System.out.println("Resultado : " + format.format(decimal));
		
		
		
	}
}
