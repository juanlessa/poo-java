import java.lang.Math;

import javax.lang.model.util.ElementScanner6;
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3){
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
        return "Triangulo[Lado1: " + this.lado1 + ", Lado2: " + this.lado2 + ", Lado3: " +this.lado3 + "]";
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Triangulo outroTriangulo = (Triangulo)obj;
        //equilatero
        if (this.lado1 == this.lado2 && this.lado1 == this.lado3) {
            if (outroTriangulo.getLado1() == outroTriangulo.getLado2() && outroTriangulo.getLado1() == outroTriangulo.getLado3() && this.lado1 == outroTriangulo.getLado1()) {
                return true;
            }else{
                return false;
            }
        }
        //escaleno
        else if (this.lado1 != this.lado2 && this.lado1 != this.lado3 && this.lado2 != this.lado3) {
            if ((outroTriangulo.getLado1() == this.lado1 || outroTriangulo.getLado1() == this.lado2 || outroTriangulo.getLado1() == this.lado3) && (outroTriangulo.getLado2() == this.lado1 || outroTriangulo.getLado2() == this.lado2 || outroTriangulo.getLado2() == this.lado3) && (outroTriangulo.getLado3() == this.lado1 || outroTriangulo.getLado3() == this.lado2 || outroTriangulo.getLado3() == this.lado3) && (outroTriangulo.getLado1() != outroTriangulo.getLado2() && outroTriangulo.getLado1() != outroTriangulo.getLado3() && outroTriangulo.getLado2() != outroTriangulo.getLado3())) {
                return true;
            }else{
                return false;
            }
        }
        //isosceles
        else{
            //l1 == l2 this
            if (this.lado1 == this.lado2) {
                //l1 == l2 outrotriangulo
                if (outroTriangulo.getLado1() == outroTriangulo.getLado2()) {
                   if (this.lado1 == outroTriangulo.getLado1() && this.lado3 == outroTriangulo.getLado3()) {
                       return true;
                   } else{
                       return false;
                   }
                }
                //l1 == l3 outrotriangulo
                else if (outroTriangulo.getLado1() == outroTriangulo.getLado3()) {
                    if (this.lado1 == outroTriangulo.getLado1() && this.lado2 == outroTriangulo.getLado2()) {
                        return true;
                    } else{
                        return false;
                    }
                }
                //l2 == l3 outrotriangulo
                else{
                    if (this.lado1 == outroTriangulo.getLado1() && this.lado2 == outroTriangulo.getLado2()) {
                        return true;
                    } else{
                        return false;
                    }
                }
                
            }
            //l1 == l3 this
            else if (this.lado1 == this.lado3) {
                //l1 == l2 outrotriangulo
                if (outroTriangulo.getLado1() == outroTriangulo.getLado2()) {
                   if (this.lado1 == outroTriangulo.getLado1() && this.lado2 == outroTriangulo.getLado3()) {
                       return true;
                   } else{
                       return false;
                   }
                }
                //l1 == l3 outrotriangulo
                else if (outroTriangulo.getLado1() == outroTriangulo.getLado3()) {
                    if (this.lado1 == outroTriangulo.getLado1() && this.lado2 == outroTriangulo.getLado2()) {
                        return true;
                    } else{
                        return false;
                    }
                }
                //l2 == l3 outrotriangulo
                else{
                    if (this.lado1 == outroTriangulo.getLado1() && this.lado2 == outroTriangulo.getLado2()) {
                        return true;
                    } else{
                        return false;
                    }
                }
            }
            //l2 == l3 this
            else {
                //l1 == l2 outrotriangulo
                if (outroTriangulo.getLado1() == outroTriangulo.getLado2()) {
                    if (this.lado1 == outroTriangulo.getLado3() && this.lado2 == outroTriangulo.getLado2()) {
                        return true;
                    } else{
                        return false;
                    }
                }
                //l1 == l3 outrotriangulo
                else if (outroTriangulo.getLado1() == outroTriangulo.getLado3()) {
                    if (this.lado1 == outroTriangulo.getLado2() && this.lado3 == outroTriangulo.getLado3()) {
                        return true;
                    } else{
                        return false;
                    }
                }
                //l2 == l3 outrotriangulo
                else{
                    if (this.lado1 == outroTriangulo.getLado1() && this.lado2 == outroTriangulo.getLado2()) {
                        return true;
                    } else{
                        return false;
                    }
                }
            }
        }
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
