public class Circulo{
    private double raio;
    private Ponto centro;
    
    public Circulo(double raio, Ponto centro){
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
        return "Circulo[Raio: " + this.raio + ", Centro: " + this.centro + "]";
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Circulo outroCirculo = (Circulo)obj;
        if (this.raio == outroCirculo.getRaio() && this.centro.equals(outroCirculo.getCentro())) {
            return true;
        }else{
            return false;
        }
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