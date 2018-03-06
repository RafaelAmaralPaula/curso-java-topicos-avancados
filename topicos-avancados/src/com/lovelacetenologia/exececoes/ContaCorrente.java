package com.lovelacetenologia.exececoes;

public class ContaCorrente {

	private double saldo;

	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	
	public void depositar(double deposito) {
		
		if(deposito <=0) {
			
			throw new IllegalArgumentException("Valor informado para deposito esta errado");
		}
		
		this.saldo += deposito;
	}

	
	public void sacar(double quantidade) throws SaldoInsuficiente  {
		
		double resultado = saldo - quantidade;
		
		if(resultado <=0) {
			
			throw new SaldoInsuficiente("Saldo invalido para sacar !"); 
			
		}
		
		this.saldo -= quantidade;
	}

	
	public double getSaldo() {
		return this.saldo;
	}

}
