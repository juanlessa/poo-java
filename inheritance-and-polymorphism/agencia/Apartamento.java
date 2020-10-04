
public class Apartamento extends Alojamento {
	private int nQuartos;
	
	public Apartamento(String codigo, String nome, String local, double diaria, int quartos) {
		super(codigo, nome, local, diaria);
		this.nQuartos = quartos;
	}

	public int getnQuartos() {
		return nQuartos;
	}

	public void setnQuartos(int nQuartos) {
		this.nQuartos = nQuartos;
	}

	@Override
	public String toString() {
		return "Apartamento " + getCodigo() + ": " + getNome() + ", " + getEndereco() + ", " + getDiaria() + " euros, nº quartos = "+ getnQuartos() +", disponivel= "+ getDisponibilidade() + ", Avaliação= " + getAvaliacao();
	}
	
}
