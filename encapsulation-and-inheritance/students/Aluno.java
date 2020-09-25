import java.util.Calendar;

public class Aluno extends Pessoa {
	private static int conta = 100;
	protected int nMec;
	protected Data dataInsc;
	
	public Aluno(String nome, int cc, Data dataNasc, Data dataInsc) {
		super(nome, cc, dataNasc);
		this.dataInsc = dataInsc;
		this.nMec = Aluno.conta;
		Aluno.conta ++;
	}
	public Aluno(String nome, int cc, Data dataNasc) {
		super(nome, cc, dataNasc);
		this.nMec = Aluno.conta;
		Aluno.conta ++;
		this.dataInsc = Data.today();
	}
	
	
	public int getnMec() {
		return nMec;
	}

	public Data getDataInsc() {
		return dataInsc;
	}
	
	public void setDataInsc(Data dataInsc) {
		this.dataInsc = dataInsc;
	}
	@Override
	public String toString() {
		return "Aluno " + nMec + ": " + this.nome + ", "+ this.cc + ", " + "Nascimento: " + this.dataNasc+ ", Inscrição: " + dataInsc;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + nMec;
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
		Aluno other = (Aluno) obj;
		if (nMec != other.nMec)
			return false;
		return true;
	}

}
