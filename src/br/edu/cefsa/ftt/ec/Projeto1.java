package br.edu.cefsa.ftt.ec;

public class Projeto1 {

	public static void main (String[] args) {
		
		String mensagem = "Vai Corinthians!!";
		System.out.println(mensagem.toUpperCase());
	
		Calc c = new Calc();
		
		People p = new People(10, "Maria Silva", 123.45f);
		
		System.out.println(p);
	}

}
