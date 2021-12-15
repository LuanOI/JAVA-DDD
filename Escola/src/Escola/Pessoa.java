package Escola;

public class Pessoa  {
	
	private String nome;
	private int ano_nascimento;
	
	public Pessoa(String nome, int ano_nascimento) {
		this.nome =nome;
		this.ano_nascimento = ano_nascimento;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoNascimento() {
		return this.ano_nascimento;
		
	}
	
	public void setAnoNascimento(int Ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}

}
