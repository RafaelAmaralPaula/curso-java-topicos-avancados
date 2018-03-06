package com.lovelacetenologia.testecasemath;

import static java.lang.Math.PI;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class TesteMath {
		
	public static void main(String[] args) {
		
		// Comprimentode uma circunferência 2 x r x PI(3,1415........)
		
		   int raio = 4 ; 
		   double comprimento = 2 * raio * PI; 
		   
		   System.out.println("Resultado : " + comprimento);
		   
		
		// Máximo e Mínimo
		
		   double [] precosProdutoA = {30.20 , 25.49};
		   double menorPreco = min(precosProdutoA[0], precosProdutoA[1]);
		   System.out.println("Menor Preço : " + menorPreco);
		   
		   System.out.println("");
		   
		   double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
				   System.out.println("Maior Preço : " + maiorPreco);
		   
		   
		   
		
		// Potência
		
		System.out.println("2 elevado 3 : " + Math.pow(2, 3)); 
		
		// Raiz Quadrada
		
		
		System.out.println("RAIZ DE 9 : " + Math.sqrt(9));
		
		
		// Arredondamento ciel , floor e round
		
		double n = 5.68;
		System.out.println("Menor inteiro : " + Math.floor(n));
		System.out.println("Maior inteiro : " + Math.ceil(n));
		System.out.println("Arrendondando : " + Math.round(n));
		
		// trigonometria
		
		  System.out.println("SENO : " + Math.tan(40)) ;
		  
		  
		// numero randomicos  
	
		  int numeroAleatorio = (int) Math.random();
		  System.out.println(numeroAleatorio);
	
	}

}
