public class Circulo extends Figura {
    private double raio;
    private Ponto centro;
    
    public Circulo(double raio, Ponto centro){
        super();
    	this.centro = centro;
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;      
    }
    public void SetRaio(double raio){
        this.raio = raio;
    }

    public Ponto getCentro(){
        return this.centro;
    }
    public void setCentro(Ponto centro){
        this.centro = centro;
    }

    @Override
    public String toString(){
        return "Circulo[Raio: " + this.raio + ", Centro: " + this.centro + ", cor: " + this.cor + "]";
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		long temp;
		temp = Double.doubleToLongBits(raio);
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
		Circulo other = (Circulo) obj;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
			return false;
		return true;
	}


    public double area(){
        return 3.1416*this.raio*this.raio;
    }
    public double perimetro(){
        return 2*3.1416*this.raio;
    }
    public boolean intersecta(Circulo c1){
        Ponto c1centro = c1.getCentro();
        double c1raio = c1.getRaio();
        if (c1centro.distancia(this.centro) <= (c1raio + this.raio)) {
            return true;
        } else{
            return false;
        }
    }
}