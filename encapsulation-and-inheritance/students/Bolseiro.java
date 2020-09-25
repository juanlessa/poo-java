
public class Bolseiro extends Aluno {
	private double bolsa = 0;
	
	public Bolseiro(String nome, int cc, Data nasc, Data insc, double bolsa) {
		super(nome,cc, nasc, insc);
		this.bolsa = bolsa;
	}
	public Bolseiro(String nome, int cc, Data nasc, Data insc) {
		super(nome, cc, nasc, insc);
	}
	public Bolseiro(String nome, int cc, Data nasc, double bolsa) {
		super(nome, cc, nasc);
		this.bolsa = bolsa;
	}
	public Bolseiro(String nome, int cc, Data nasc) {
		super(nome, cc, nasc);
	}
	public double getBolsa() {
		return bolsa;
	}
	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
	@Override
	public String toString() {
		return "Aluno " + nMec + ": " + this.nome + ", "+ this.cc + ", " + "Nascimento: " + this.dataNasc+ ", Inscrição: " + dataInsc + ", bolsa: " + bolsa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bolsa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bolseiro other = (Bolseiro) obj;
		if (Double.doubleToLongBits(bolsa) != Double.doubleToLongBits(other.bolsa))
			return false;
		return true;
	}
	
	
}
