import java.lang.Math;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y){
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Ponto other = (Ponto) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}


    public double distancia(Ponto p){
        double p1x = p.getX();
        double p1y = p.getY();
        double p2x = this.x;
        double p2y = this.y;
        double distancia = Math.sqrt(Math.pow(p1x - p2x,2) + Math.pow(p1y - p2y, 2));
        return distancia;
    }
}