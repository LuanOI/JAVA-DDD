package Escola;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("=================DADOS DA PESSOA===================");
		
		Pessoa p1 = new Pessoa ("Luan Oliveira", 1999);
		
		System.out.println("Nome da Pessoa: " + p1.getNome());
		System.out.println("Ano de Nascimento da pessoa: "+p1.getAnoNascimento());
		
		System.out.println();
		
		System.out.println("=================DADOS DO ALUNO===================");
		
		Aluno a1 = new Aluno ("Ruan Brito", 1995, "123");
		
		System.out.println("Nome do Aluno: "+a1.getNome());
		System.out.println("Ano de Nascimento do Aluno: "+a1.getAnoNascimento());
		System.out.println("RA do Aluno: "+a1.getRa());
		
		System.out.println();
		
		System.out.println("=================DADOS DO PROFESSOR===================");
		
		Professor pr1 = new Professor("Nattan Oliveira", 1998, "124");
		
		System.out.println("nome do Professor: "+pr1.getNome());
		System.out.println("Ano de Nascimento do Professor: "+pr1.getAnoNascimento());
		System.out.println("Número de matrícula do Professor: " + pr1.getMatricula());

	}

}
