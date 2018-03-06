package com.lovelacetenologia.strings;

public class TesteString {

	public static void main(String[] args) {
		
		//String , StringBuilder e StringBuffer
		
		StringBuilder builder = new StringBuilder("Olá ,");
		builder.append("Pessoal");
		
		String resultado = builder.toString();
		
		System.out.println(resultado);
	
		
	}

}
