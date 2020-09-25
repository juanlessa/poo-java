import java.lang.Math;

public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3){
    	super();
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1(){
        return this.lado1;
    }
    public void setLado1(double lado1){
        this.lado1 = lado1;
    }

    public double getLado2(){
        return this.lado2;
    }
    public void setLado2(double lado2){
        this.lado2 = lado2;
    }

    public double getLado3(){
        return this.lado3;
    }
    public void setLado3(double lado3){
        this.lado3 = lado3;
    }

    @Override
    public String toString(){
        return "Triangulo[Lado1: " + this.lado1 + ", Lado2: " + this.lado2 + ", Lado3: " +this.lado3 + ", cor: "+ this.cor +"]";
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(lado1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lado2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lado3);
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
		Triangulo other = (Triangulo) obj;
		if (Double.doubleToLongBits(lado1) != Double.doubleToLongBits(other.lado1))
			return false;
		if (Double.doubleToLongBits(lado2) != Double.doubleToLongBits(other.lado2))
			return false;
		if (Double.doubleToLongBits(lado3) != Double.doubleToLongBits(other.lado3))
			return false;
		return true;
	}


    public double perimetro(){
        return this.lado1 + this.lado2 + this.lado3;
    }

    public double area(){
        double p = this.perimetro()/2;
        double a = Math.sqrt(p*(p - this.lado1)*(p - this.lado2)*(p - this.lado3));
        return a;
    }
}
