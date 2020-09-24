
public class Livro {
	private static int conta = 100;
	private int id;
	private String titulo;
	private String tipoEmprestimo;
	
	public Livro(String titulo, String tipoEmprestimo) {
		this.id = Livro.conta;
		Livro.conta++;
		this.titulo = titulo;
		this.tipoEmprestimo = tipoEmprestimo;
	}
	public Livro(String titulo) {
		this.id = Livro.conta;
		Livro.conta++;
		this.titulo = titulo;
		this.tipoEmprestimo = "NORMAL";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipoEmprestimo() {
		return tipoEmprestimo;
	}

	public void setTipoEmprestimo(String tipoEmprestimo) {
		this.tipoEmprestimo = tipoEmprestimo;
	}

	@Override
	public String toString() {
		return "Livro " + id + "; " + titulo + "; " + tipoEmprestimo;
	}
	
	
	
}
