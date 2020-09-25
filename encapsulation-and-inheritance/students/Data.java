import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public static Data today() {
		Date hoje = new Date(); 
		SimpleDateFormat formata;
		formata = new SimpleDateFormat("y");
		int ano = Integer.parseInt(formata.format(hoje));
		formata = new SimpleDateFormat("M");
		int mes = Integer.parseInt(formata.format(hoje));
		formata = new SimpleDateFormat("d");
		int dia = Integer.parseInt(formata.format(hoje));
		Data h = new Data(dia, mes, ano);
		return h;
	}

	@Override
	public String toString() {
		return "" + dia + "/" + mes + "/" + ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (ano != other.ano)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	
	
}
