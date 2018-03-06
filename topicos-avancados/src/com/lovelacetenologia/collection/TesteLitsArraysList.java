package com.lovelacetenologia.collection;

import java.util.ArrayList;
import java.util.List;

public class TesteLitsArraysList {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Rodrigo");
		Aluno a2 = new Aluno("Juliano");
		Aluno a3 = new Aluno("Gabriel");
		Aluno a4 = new Aluno("Valdeci");
		Aluno a5 = new Aluno("Roberto");
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a5);
		
		
	    imprimirAluno(alunos);
		
	}

	public static void imprimirAluno(List<Aluno> alunos) {
		
		for(Aluno a : alunos) {
			
			System.out.println("NOME -> " + a.getNome());
			
		}
		
	}
}
