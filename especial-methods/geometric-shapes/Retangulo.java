public class Retangulo {
    private double comprimento;
    private double altura;

    public Retangulo(double comprimento, double altura){
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
        return "Retangulo[Comprimento: " + this.comprimento + ", Altura: " + this.altura +"]";
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (this == obj){
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Retangulo outroRetangulo = (Retangulo)obj;
        if (this.comprimento == outroRetangulo.getComprimento() && this.altura == outroRetangulo.getAltura()) {
            return true;
        }else{
            return false;
        }
    }


    public double perimetro(){
        return 2*(this.altura + this.comprimento);
    }
    public double area(){
        return this.comprimento * this.altura;
    }
}
