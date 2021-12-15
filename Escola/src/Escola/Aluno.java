package Escola;

public class Aluno extends Pessoa {

	private String ra;
	
	public Aluno(String nome, int ano_nascimento, String ra) {
		super(nome, ano_nascimento);
		this.ra = ra;
	}
	
	public String getRa() {
		return this.ra;
	}
	
	public void setRa(String ra) {
		this.ra =ra;
	}
}
