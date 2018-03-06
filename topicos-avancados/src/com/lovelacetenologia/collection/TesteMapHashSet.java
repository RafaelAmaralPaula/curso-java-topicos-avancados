package com.lovelacetenologia.collection;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashSet {

	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno("Rodrigo");
		Aluno a2 = new Aluno("Juliano");
		Aluno a3 = new Aluno("Gabriel");
		Aluno a4 = new Aluno("Valdeci");
		Aluno a5 = new Aluno("Roberto");
		
		Map<String, Aluno> alunos = new HashMap<String, Aluno>(); 
		
		alunos.put("1" , a1);
		alunos.put("2" , a2);
		alunos.put("3" , a3);
		alunos.put("4" , a4);
		alunos.put("5" , a5);
		
		
	    imprimirAluno(alunos);
		
	    Aluno recuperado = alunos.get("4");
	    
	    System.out.println("NOME Aluno RECUPERADO -> " + recuperado.getNome());
		
	    System.out.println("");
	    System.out.println("");
	    System.out.println("");
	    
	}

     public static void imprimirAluno(Map<String, Aluno> alunos) {
    	 
    	 for (Aluno a : alunos.values()) {
			
    		 System.out.println("NOME -> " + a.getNome());
    		 
		}
    	 
	}

}
