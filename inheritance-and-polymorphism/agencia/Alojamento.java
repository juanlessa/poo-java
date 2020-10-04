
public class Alojamento {
	private String codigo;
	private String nome;
	private String endereco;
	private double diaria;
	private boolean disponibilidade;
	private double avaliacao;
	
	public Alojamento(String cod, String nome, String local, double diaria) {
		super();
		this.codigo = cod;
		this.nome = nome;
		this.endereco = local;
		this.diaria = diaria;
		this.avaliacao = 0;
		this.disponibilidade = true;
	}
	
	public boolean checkIn(){
		if (this.disponibilidade) {
			this.disponibilidade = false;
			return true;
		}
		return false;
	}
	public boolean checkOut(double nota) {
		if (!(this.disponibilidade)) {
			this.avaliacao = nota;
			this.disponibilidade = true;
			return true;
		}
		return false;
	}
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getDiaria() {
		return diaria;
	}

	public void setDiaria(double diaria) {
		this.diaria = diaria;
	}

	public boolean getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	@Override
	public String toString() {
		return "Alojamento " + codigo + ":" + nome + ", " + endereco + ", diaria= " + diaria
				+ ", disponibilidade= " + disponibilidade + ", avaliacao= " + avaliacao;
	}
	
}
