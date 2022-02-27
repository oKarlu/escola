package com.stefanini.hackathon.escola;

public class TesteTurma {

	public static void main(String[] args) {
		Turma fj3a = new Turma();
		fj3a.alunos = new Aluno[10];
		
		fj3a.alunos[0] = new Aluno();
		fj3a.alunos[0].nome = "Mauricio";
		fj3a.alunos[0].nota = 5;
		
		fj3a.alunos[1] = new Aluno();
		fj3a.alunos[1].nome = "Marcelo";
		fj3a.alunos[1].nota = 9;
		
		
		fj3a.imprimeNotas();
		
	}

}
