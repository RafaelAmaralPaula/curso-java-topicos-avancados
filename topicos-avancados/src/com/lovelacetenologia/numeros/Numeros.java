package com.lovelacetenologia.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("R$ # ,##0.00");
		
		System.out.println("Valor :");
		double valor = teclado.nextDouble();
		
		
		
		BigDecimal bd  = new BigDecimal(valor);
		BigDecimal resultado = bd.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
		bd = bd.add(resultado);
		

		
		System.out.println("Resultado : " + format.format(bd));
				
		teclado.close();		
				
;	}
}
