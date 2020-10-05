
public class QuartoHotel extends Alojamento {
	private String tipo;
	
	public QuartoHotel(String codigo, String nome, String local, Double diaria, String tipo) {
		super(codigo, nome, local, diaria);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Quarto " + tipo + " " + getCodigo() + ": " + getNome()
				+ ", " + getEndereco() + ", Diaria= " + getDiaria() + " euros, Disponibilidade= "
				+ getDisponibilidade() + ", Avaliacao= " + getAvaliacao();
	}
	
}
