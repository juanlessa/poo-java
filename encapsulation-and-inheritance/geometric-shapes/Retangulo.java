public class Retangulo extends Figura {
    private double comprimento;
    private double altura;

    public Retangulo(double comprimento, double altura){
        super();
    	this.comprimento = comprimento;
        this.altura = altura;
    }

    public double getComprimento(){
        return this.comprimento;
    }
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public String toString(){
        return "Retangulo[Comprimento: " + this.comprimento + ", Altura: " + this.altura + ", cor: " + this.cor + "]";
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(comprimento);
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
		Retangulo other = (Retangulo) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (Double.doubleToLongBits(comprimento) != Double.doubleToLongBits(other.comprimento))
			return false;
		return true;
	}


    public double perimetro(){
        return 2*(this.altura + this.comprimento);
    }
    public double area(){
        return this.comprimento * this.altura;
    }
}
