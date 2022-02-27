package com.stefanini.hackathon.escola;

public class TesteTurma {

	public static void main(String[] args) {
		Turma fj3a = new Turma();
		fj3a.notas = new int[10];
		
		fj3a.notas[0] = 9;
		fj3a.notas[1] = 5;
		
		fj3a.imprimeNotas();
		
	}

}
