package com.stefanini.hackathon.escola;

public class Turma {
	int [] notas;
	
	void imprimeNotas() {
		for(int i = 0; i < this.notas.length; i++) {
			System.out.println(this.notas[i]);
		}
	}
	
}
