
public class Utilizador {
	private String nome;
	private int nMec;
	private String curso;
	public Utilizador(String nome, int nMec, String curso) {
		this.nome = nome;
		this.nMec = nMec;
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getnMec() {
		return nMec;
	}
	public void setnMec(int nMec) {
		this.nMec = nMec;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Aluno: " + nMec + "; " + nome + "; " + curso;
	}
	
	
	
}
