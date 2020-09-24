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
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Ponto outroPonto = (Ponto)obj;
        if (this.x == outroPonto.getX() && this.y == outroPonto.getY()) {
            return true;
        }else{
            return false;
        }
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