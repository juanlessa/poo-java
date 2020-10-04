
public class Carro {
	private char classe;
	private String combustivel;
	private boolean disponivel;
	
	public Carro(char classe, String combustivel) {
		this.classe = classe;
		this.combustivel = combustivel;
		this.disponivel = true;
	}
	
	public boolean levantar() {
		if (this.disponivel) {
			this.disponivel = false;
			return true;
		}
		return false;
	}
	public boolean entregar() {
		if (!(this.disponivel)) {
			this.disponivel = true;
			return true;
		}
		return false;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	@Override
	public String toString() {
		return "Carro: classe: " + classe + ", combustivel: " + combustivel + ", disponivel: " + disponivel;
	}
	
	
	
}
