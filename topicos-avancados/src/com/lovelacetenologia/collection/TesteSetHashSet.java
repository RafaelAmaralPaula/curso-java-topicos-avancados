package com.lovelacetenologia.collection;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {

	public static void main(String[] args) {
	
		
		Aluno a1 = new Aluno("Rodrigo");
		Aluno a2 = new Aluno("Juliano");
		Aluno a3 = new Aluno("Gabriel");
		Aluno a4 = new Aluno("Valdeci");
		Aluno a5 = new Aluno("Roberto");
		
		Set<Aluno> alunos = new HashSet<Aluno>(); 
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a5);
		
		
	    imprimirAluno(alunos);
		
	}

	public static void imprimirAluno(Set<Aluno> alunos) {
		
		for (Aluno aluno : alunos) {
			
			System.out.println("NOME -> " + aluno.getNome());
		}
		
	}
}
