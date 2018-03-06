package com.lovelacetenologia.exececoes;

public class TesteExcecoesCheacada {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(150);

		try {
			contaCorrente.sacar(90);
			System.out.println("Saldo da conta : " + contaCorrente.getSaldo());
		} catch (SaldoInsuficiente e) {
			System.out.println("ERRO : " + e.getMessage());
		}

	}
}
