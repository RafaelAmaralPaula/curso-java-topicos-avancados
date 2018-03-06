package com.lovelacetenologia.exececoes;

public class TesteExcecoes {

	public static void main(String[] args) {
		
		//  int numero = 5 / 0; //Lança essa exceção java.lang.ArithmeticException
		
		
		//  String s = "Um Texto";
		//  s = null;
		//  String maisula = s.toUpperCase(); // Lança  java.lang.NullPointerException
		
		
		ContaCorrente corrente = new ContaCorrente(-10);
		
		try {
			
			corrente.depositar(100);	
			System.out.println("Saldo Atual : " + corrente.getSaldo());
			
		}catch (IllegalArgumentException e) {
                
			System.out.println("Valor Informado não é corente com as regras do bancos ! : " + e.getMessage());
			
		}finally {
			
			System.out.println("Muito Obrigado !");
			
		}
		
		
	
		
	}
	
}
