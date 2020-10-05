import java.util.ArrayList;

public class Agencia {
	private String nome;
	private String endereco;
	private ArrayList<Alojamento> aloj;
	private ArrayList<Carro> car;
	
	public Agencia(String nome, String local) {
		this.nome = nome;
		this.endereco = local;
		this.car = new ArrayList<>();
		this.aloj = new ArrayList<>();
	}
	public void addCarro(Carro c) {
		this.car.add(c);
	}
	public void addAlojamento(Alojamento a) {
		this.aloj.add(a);
	}

	public ArrayList<Carro> getCar(){
		return this.car;
	}
	public ArrayList<Alojamento> getAloj(){
		return this.aloj;
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

	@Override
	public String toString() {
		return "Agencia: " + nome + ", " + endereco;
	}


}
