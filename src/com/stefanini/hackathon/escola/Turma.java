package com.stefanini.hackathon.escola;

public class Turma {
	Aluno[] alunos;
	
	void imprimeNotas() {
		for(int i = 0; i < this.alunos.length; i++) {
			Aluno aluno = this.alunos[i];
			System.out.println(aluno.nota);
		}
	}
	
}
