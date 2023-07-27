package entities;

public class Boletim {

	// Atributos
	private String nome;
	private double notaFinal;

	// Contrutor
	public Boletim(String nome) {
		this.nome = nome;

	}

	// Metodos
	public void resultado(double x, double y, double z) {
		this.notaFinal = x + y + z;
	}

	// Getters & Setters
	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	

}
